/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.recursos.utilitarios;

/**
 *
 * @author Thyago
 */
public class Calculadora {

    /**calculo de juros simples
     * @param capital retirado
     * @param taxa juro ao mês
     * @param periodos em que se calcula o juro
     * @return juros simples
     */
    public double juroSimples(double capital, double taxa, int periodos){
        return capital * taxa * periodos;
    }
    
    /**calculo de montante simples
     * @param capital retirado
     * @param taxa juro ao mês
     * @param periodos em que se calcula o juro
     * @return montante simples
     */
    public double montanteSimples(double capital, double taxa, int periodos){
        return capital * (1 + (taxa * periodos));
    }
    
    /**calculo de juros composto
     * @param capital retirado
     * @param taxa juro ao mês
     * @param periodos em que se calcula o juro
     * @return juros composto
     */
    public double juroComposto(double capital, double taxa, int periodos){
        return montanteComposto(capital, taxa, periodos) - capital;
    }

    /**calculo de montante composto
     * @param capital retirado
     * @param taxa juro ao mês
     * @param periodos em que se calcula o juro
     * @return montante composto
     */
    public double montanteComposto(double capital, double taxa, int periodos){
        return capital * Math.pow((1 + taxa), periodos);
    }
    
    public double regradeTres(double v1, double v2, double v3){
        return (v2 * v3) / v1;
    }

}
