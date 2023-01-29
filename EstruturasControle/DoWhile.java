package EstruturasControle;

import javax.swing.JOptionPane;

public class DoWhile {
    public static void main(String[] args) {
        String condicao = "";

        //faça enquanto condicao diferente de sair.
        do{
            condicao = JOptionPane.showInputDialog("errou");
        }while(!condicao.equalsIgnoreCase("sair"));
    }
}
