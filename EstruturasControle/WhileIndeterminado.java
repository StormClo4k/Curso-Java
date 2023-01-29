package EstruturasControle;

import javax.swing.JOptionPane;

public class WhileIndeterminado {
    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog("Digite algo");
        // Enquanto valor for diferente de sair
        while(!valor.equalsIgnoreCase("sair")){

           valor = JOptionPane.showInputDialog("Digite algo novamente");
        }
    }
}
