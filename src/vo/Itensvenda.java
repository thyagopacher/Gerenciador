package vo;
// Generated 30/09/2013 20:22:48 by Hibernate Tools 3.6.0



/**
 * Itensvenda generated by hbm2java
 */
public class Itensvenda  implements java.io.Serializable {


     private int codigo;
     private Venda venda;
     private Produto produto;
     private double valor;

    public Itensvenda() {
    }

	
    public Itensvenda(int codigo) {
        this.codigo = codigo;
    }
    public Itensvenda(int codigo, Venda venda, Produto produto, double valor) {
       this.codigo = codigo;
       this.venda = venda;
       this.produto = produto;
       this.valor = valor;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Venda getVenda() {
        return this.venda;
    }
    
    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }




}


