package vo;
// Generated 30/09/2013 20:22:48 by Hibernate Tools 3.6.0



/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable {


     private int codigo;
     private String nome;
     private String sigla;
     private String moeda;
     private String milhar;
     private String decimal;

    public Pais() {
    }

	
    public Pais(int codigo) {
        this.codigo = codigo;
    }
    public Pais(int codigo, String nome, String sigla, String moeda, String milhar, String decimal) {
       this.codigo = codigo;
       this.nome = nome;
       this.sigla = sigla;
       this.moeda = moeda;
       this.milhar = milhar;
       this.decimal = decimal;
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
    public String getSigla() {
        return this.sigla;
    }
    
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getMoeda() {
        return this.moeda;
    }
    
    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }
    public String getMilhar() {
        return this.milhar;
    }
    
    public void setMilhar(String milhar) {
        this.milhar = milhar;
    }
    public String getDecimal() {
        return this.decimal;
    }
    
    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }




}


