package EstruturasControle;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Digite um valor");
        double num1 = Double.parseDouble(valor);

        if(num1 % 2 == 0){
            System.out.println("O resultado do modulo é exato");
        }   else{
            System.out.println("O resultado do modulo tem resto");
        }

        


    }
}
