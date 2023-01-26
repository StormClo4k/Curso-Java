package Fundamentos;

import javax.swing.JOptionPane;

public class StringParaNum {
    public static void main(String[] args) {

        /*JOptionPane.showInputDialog("") = Abre uma janela para incercao
         * dos dados sem q aja a necessidade de um Scanner (Incercao pelo -
        console*/

        String var1 = JOptionPane.showInputDialog(
            "Digite o Primeiro Valor:");

        String var2 = JOptionPane.showInputDialog(
            "Digite o Segundo Valor:");
      
        //Faz a conversão das Strings para double (Já fazendo a soma)    
        Double conv = Double.parseDouble(var1);
        Double conv2 = Double.parseDouble(var2);

        System.out.println("A soma dos valores é de " + (conv + conv2));

    }
}
