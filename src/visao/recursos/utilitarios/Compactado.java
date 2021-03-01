/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.recursos.utilitarios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author ThyagoHenrique
 */
public class Compactado {

    private static final int TAMANHO_BUFFER = 2048; // 2 Kb  

    private File arquivoZipAtual;

    /*
    Lista entradas zip do arquivo
    @param arquivo seria passado por parametro para ver as entradas
    */

    /**
     *
     * @param arquivo
     * @return
     * @throws ZipException
     * @throws IOException
     */
    
    @SuppressWarnings("unchecked")
    public List<Object> listarEntradasZip(File arquivo) throws ZipException, IOException {
        List<Object> entradasDoZip = new ArrayList<>(100);
        try (ZipFile zip = new ZipFile(arquivo)) {
            Enumeration<? extends ZipEntry> e = zip.entries();
            while (e.hasMoreElements()) {
                ZipEntry entrada = e.nextElement();
                entradasDoZip.add(entrada);
            }
            setArquivoZipAtual(arquivo);
        }
        return entradasDoZip;
    }

    public void extrairZip(File diretorio) throws ZipException, IOException {
        extrairZip(this.getArquivoZipAtual(), diretorio);
    }

    public void extrairZip(File arquivoZip, File diretorio) throws ZipException, IOException {
        InputStream is = null;
        OutputStream os = null;
        ZipFile zip = new ZipFile(arquivoZip);
        byte[] buffer = new byte[TAMANHO_BUFFER];
        try {
            //cria diretório informado, caso não exista  
            if (!diretorio.exists()) {
                diretorio.mkdirs();
            }
            if (!diretorio.exists() || !diretorio.isDirectory()) {
                throw new IOException("Informe um diretório válido");
            }
            Enumeration<? extends ZipEntry> e = zip.entries();
            while (e.hasMoreElements()) {
                ZipEntry entrada = e.nextElement();
                File arquivo = new File(diretorio, entrada.getName());
                //se for diretório inexistente, cria a estrutura   
                //e pula pra próxima entrada  
                if (entrada.isDirectory() && !arquivo.exists()) {
                    arquivo.mkdirs();
                    continue;
                }
                //se a estrutura de diretórios não existe, cria  
                if (!arquivo.getParentFile().exists()) {
                    arquivo.getParentFile().mkdirs();
                }
                try {
                    //lê o arquivo do zip e grava em disco  
                    is = zip.getInputStream(entrada);
                    os = new FileOutputStream(arquivo);
                    int bytesLidos;
                    if (is == null) {
                        throw new ZipException("Erro ao ler a entrada do zip: " + entrada.getName());
                    }
                    while ((bytesLidos = is.read(buffer)) > 0) {
                        os.write(buffer, 0, bytesLidos);
                    }
                } finally {
                    if (is != null) {
                        try {
                            is.close();
                        } catch (IOException ex) {
                            ex.getMessage();
                        }
                    }
                    if (os != null) {
                        try {
                            os.close();
                        } catch (IOException ex) {
                            ex.getMessage();
                        }
                    }
                }
            }
        } finally {
            try {
                zip.close();
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
    }

    public List<Object> criarZip(File arquivoZip, File[] arquivos) throws ZipException, IOException {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        setArquivoZipAtual(null);
        try {
            //adiciona a extensão .zip no arquivo, caso não exista  
            if (!arquivoZip.getName().toLowerCase(Locale.getDefault()).endsWith(".zip")) {
                arquivoZip = new File(arquivoZip.getAbsolutePath() + ".zip");
            }
            fos = new FileOutputStream(arquivoZip);
            bos = new BufferedOutputStream(fos, TAMANHO_BUFFER);
            setArquivoZipAtual(arquivoZip);
            return criarZip(bos, arquivos);
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
    }

    public List<Object> criarZip(OutputStream os, File[] arquivos) throws ZipException, IOException {
        if (arquivos == null || arquivos.length < 1) {
            throw new ZipException("Adicione ao menos um arquivo ou diretório");
        }
        List<Object> listaEntradasZip = new ArrayList<>(100);
        ZipOutputStream zos              = null;
        try {
            zos = new ZipOutputStream(os);
            for (File arquivo : arquivos) {
                String caminhoInicial = arquivo.getParent();
                List<Object> novasEntradas = adicionarArquivoNoZip(zos, arquivo, caminhoInicial);
                if (novasEntradas != null) {
                    listaEntradasZip.addAll(novasEntradas);
                }
            }
        } finally {
            if (zos != null) {
                try {
                    zos.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
        return listaEntradasZip;
    }

    /*
    Adicionar arquivo a zipado que já exista
    @param zos arquivo zipado
    @param arquivo a ser adicionado
    @param caminhoInicial para o arquivo
    */
    private List<Object> adicionarArquivoNoZip(ZipOutputStream zos, File arquivo, String caminhoInicial) throws IOException {
        List<Object>        listaEntradasZip = new ArrayList<>(100);
        FileInputStream     fis              = null;
        BufferedInputStream bis              = null;
        byte                buffer[]         = new byte[TAMANHO_BUFFER];
        try {
            //diretórios não são adicionados  
            if (arquivo.isDirectory()) {
                //recursivamente adiciona os arquivos dos diretórios abaixo  
                File[] arquivos = arquivo.listFiles();
                for (File arquivo1 : arquivos) {
                    List<Object> novasEntradas = adicionarArquivoNoZip(zos, arquivo1, caminhoInicial);
                    if (novasEntradas != null) {
                        listaEntradasZip.addAll(novasEntradas);
                    }
                }
                return listaEntradasZip;
            }
            String caminhoEntradaZip = null;
            int idx = arquivo.getAbsolutePath().indexOf(caminhoInicial);
            if (idx >= 0) {
                //calcula os diretórios a partir do diretório inicial  
                //isso serve para não colocar uma entrada com o caminho completo  
                caminhoEntradaZip = arquivo.getAbsolutePath().substring(idx + caminhoInicial.length() + 1);
            }
            ZipEntry entrada = new ZipEntry(caminhoEntradaZip);
            zos.putNextEntry(entrada);
            zos.setMethod(ZipOutputStream.DEFLATED);
            fis = new FileInputStream(arquivo);
            bis = new BufferedInputStream(fis, TAMANHO_BUFFER);
            int bytesLidos;
            while ((bytesLidos = bis.read(buffer, 0, TAMANHO_BUFFER)) != -1) {
                zos.write(buffer, 0, bytesLidos);
            }
            listaEntradasZip.add(entrada);
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
        return listaEntradasZip;
    }

    public void fecharZip() {
        setArquivoZipAtual(null);
    }

    public File getArquivoZipAtual() {
        return arquivoZipAtual;
    }

    private void setArquivoZipAtual(File arquivoZipAtual) {
        this.arquivoZipAtual = arquivoZipAtual;
    }
}
