package vo;
// Generated 30/09/2013 20:22:48 by Hibernate Tools 3.6.0



/**
 * Imagem generated by hbm2java
 */
public class Imagem  implements java.io.Serializable {


     private int codigo;
     private String nome;
     private String caminho;

    public Imagem() {
    }

	
    public Imagem(int codigo) {
        this.codigo = codigo;
    }
    public Imagem(int codigo, String nome, String caminho) {
       this.codigo = codigo;
       this.nome = nome;
       this.caminho = caminho;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCaminho() {
        return this.caminho;
    }
    
    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }




}

