package EstruturasControle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        /*segunda retorna 1
         * terça retora 2
         * assim por diante.
         */

    String dia = JOptionPane.showInputDialog("Digite o dia da semana: ");

        if(dia.equalsIgnoreCase("segunda")){
            System.out.println("1");
        }   else if(dia.equalsIgnoreCase("terça")){
                System.out.println("2");
        }   else if(dia.equalsIgnoreCase("quarta")){
                System.out.println("3");
        }   else if(dia.equalsIgnoreCase("quinta")){
                System.out.println("4");
        }   else if(dia.equalsIgnoreCase("sexta")){
                System.out.println("5");
        }   else if(dia.equalsIgnoreCase("sabado")){
                System.out.println("6");
        }   else if(dia.equalsIgnoreCase("domingo")){
                System.out.println("7");
        }   else{
                System.out.println("Opsão invalida");
        }

    }
}
