/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio5q3;

/**
 *
 * @author yasmi
 */
public class Desafio5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
      int cod;
        double valor, acDebito, acCredito;
        acDebito = 0; acCredito=0; cod=1;

        while(cod != 0){
            cod = Integer.parseInt(JOptionPane.showInputDialog("(1) débito, "
                    + "(2) crédito e (0) fim"));
            if(cod == 1 || cod == 2){
                valor = Double.parseDouble(JOptionPane.
                        showInputDialog("Informe o valor:"));
                if(cod == 1){
                    acDebito = acDebito + valor;
                    JOptionPane.showMessageDialog(null, "Valor debitado R$ "+valor);
                }else{
                    acCredito = acCredito + valor;
                    JOptionPane.showMessageDialog(null, "Valor creditado R$ "+valor);
                }//fim do if interno
            }else if(cod==0){
                JOptionPane.showMessageDialog(null, "Fim do programa!!");
            }else{
                JOptionPane.showMessageDialog(null, "Codigo inválido");
            } //fim do if principal
        }//fim do loop
        JOptionPane.showMessageDialog(null,"       Extrato Final\n--------------------------------\n"
                + "Créditos R$ "+acCredito 
                + "\nDébitos R$ "+acDebito +"\n--------------------------------\n"
                        + "Saldo Final R$ "+(acCredito-acDebito));
    }

}
