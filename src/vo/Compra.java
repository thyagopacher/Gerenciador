package vo;
// Generated 30/09/2013 20:22:48 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Compra generated by hbm2java
 */
public class Compra  implements java.io.Serializable {


     private int codigo;
     private Pessoa pessoa;
     private Date dtcompra;
     private Date dtvencimento;
     private int parcela;
     private Set itenscompras = new HashSet(0);
     private Set itenscompras_1 = new HashSet(0);

    public Compra() {
    }

	
    public Compra(int codigo) {
        this.codigo = codigo;
    }
    public Compra(int codigo, Pessoa pessoa, Date dtcompra, Date dtvencimento, int parcela, Set itenscompras, Set itenscompras_1) {
       this.codigo = codigo;
       this.pessoa = pessoa;
       this.dtcompra = dtcompra;
       this.dtvencimento = dtvencimento;
       this.parcela = parcela;
       this.itenscompras = itenscompras;
       this.itenscompras_1 = itenscompras_1;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Date getDtcompra() {
        return this.dtcompra;
    }
    
    public void setDtcompra(Date dtcompra) {
        this.dtcompra = dtcompra;
    }
    public Date getDtvencimento() {
        return this.dtvencimento;
    }
    
    public void setDtvencimento(Date dtvencimento) {
        this.dtvencimento = dtvencimento;
    }
    public int getParcela() {
        return this.parcela;
    }
    
    public void setParcela(int parcela) {
        this.parcela = parcela;
    }
    public Set getItenscompras() {
        return this.itenscompras;
    }
    
    public void setItenscompras(Set itenscompras) {
        this.itenscompras = itenscompras;
    }
    public Set getItenscompras_1() {
        return this.itenscompras_1;
    }
    
    public void setItenscompras_1(Set itenscompras_1) {
        this.itenscompras_1 = itenscompras_1;
    }




}


