package vo;
// Generated 30/09/2013 20:22:48 by Hibernate Tools 3.6.0



/**
 * Servico generated by hbm2java
 */
public class Servico  implements java.io.Serializable {


     private int codigo;
     private String nome;

    public Servico() {
    }

	
    public Servico(int codigo) {
        this.codigo = codigo;
    }
    public Servico(int codigo, String nome) {
       this.codigo = codigo;
       this.nome = nome;
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




}


