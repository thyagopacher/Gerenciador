/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.recursos.utilitarios;

import br.com.uol.pagseguro.domain.AccountCredentials;
import br.com.uol.pagseguro.domain.Currency;
import br.com.uol.pagseguro.domain.PaymentRequest;
import br.com.uol.pagseguro.exception.PagSeguroServiceException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import vo.Itensvenda;

/**
 *
 * @author ThyagoHenrique
 */
public class PagSeguro {
    PaymentRequest paymentRequest = new PaymentRequest();  
    
    public PagSeguro(){
        paymentRequest.setCurrency(Currency.BRL);  
    }
    
    public void adicionaItem(List<Itensvenda> obj){
        if(obj != null && !obj.isEmpty()){
            obj.stream().forEach((iv) -> {
                paymentRequest.addItem(
                        String.valueOf(iv.getVenda().getCodigo()),
                        iv.getProduto().getNome().toUpperCase(Locale.getDefault()), 1,
                        new BigDecimal(iv.getValor()),
                        new Long(1000),
                        null
                );
            });
        }
        
    }
    
/**
 * Adiciona endereço do cliente para a operação do pagseguro
     * @param pais
     * @param siglaest
     * @param complemento
 @pais onde mora a pessoa
 @siglaest sigla do estado ao que a pessoa pertence
 @param estado ao que pertence a pessoa
 @param cidade ao que pertence a pessoa
 @param bairro ao que pertence a pessoa
 @param rua ao que pertence a pessoa
 @param cep ao que pertence a pessoa
 @param num ao que pertence a pessoa
 @complemento ao que pertence a pessoa
 **/    
    public void adicionaEndereco(String pais, String siglaest, String estado, String cidade, String bairro, String rua, String cep, String num, String complemento){
        paymentRequest.setShippingAddress(  
            pais,   
            siglaest,   
            estado,   
            cidade,   
            cep,   
            rua,   
            num,   
            complemento  
        );        
    }
    
    /**Adiciona novo cliente a operação do pagsegur
     * @param nome
     * @param email
     * @param ddd
     * @param telefone*/
    public void adicionaCliente(String nome, String email, String ddd, String telefone){
        paymentRequest.setSender(nome, email, ddd, telefone);         
    }
    
    public URL adicionaLoja(String login, String token){
        URL paymentURL = null;
        try {
            paymentURL = paymentRequest.register(new  
            AccountCredentials(  
                login,   
                token)         
            );
        } catch (PagSeguroServiceException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao logar vendedor para compra do cliente:\n" + ex, "ERRO no pagseguro:", JOptionPane.ERROR_MESSAGE);
        }
        return paymentURL;
    }
}
