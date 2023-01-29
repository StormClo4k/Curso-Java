package EstruturasControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args){
        
        // verifica notas dos alunos e da a media das notas acima de 7
        Scanner leitor = new Scanner(System.in);

        double nota = 0;
        double total = 0;
        int notasValidas = 0;

        while(nota != -1){

            System.out.println("Digite a nota do aluno: ");
            nota = leitor.nextDouble();

            if(nota <= 10 && nota >= 7){
                notasValidas++;
                total += nota;
            }   else if(nota != -1){
                System.out.println("nota baixa (Invalida)");
            }
        }

        leitor.close();
        double media = total / notasValidas;
        System.out.println("Media: " + media);
        System.out.println("Notas Validas: " + notasValidas);
    }
}
