package vo;
// Generated 30/09/2013 20:22:48 by Hibernate Tools 3.6.0



/**
 * Banco generated by hbm2java
 */
public class Banco  implements java.io.Serializable {


     private int codigo;
     private String nome;

    public Banco() {
    }

	
    public Banco(int codigo) {
        this.codigo = codigo;
    }
    public Banco(int codigo, String nome) {
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

