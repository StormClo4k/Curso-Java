package Desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args){

        /* O desafio consiste em receber 3 entradas de salario,
         * sendo elas com . ou , e fazer a conversão das mesmas
         * de String para algum valor numerico, tendo como obje-
           tivo final apresentar a media dos salarios */

        Scanner entrada = new Scanner(System.in);

        //Captura a entrada de dados do teclado (terminal)
        //.replace("," , ".") ira altarar as , das strings por .
        System.out.print("Digite o seu antepenutimo salario: ");
        String s1 = entrada.nextLine().replace("," , ".");

        System.out.print("Digite o seu penultimo salario: ");
        String s2 = entrada.nextLine().replace("," , ".");

        System.out.print("Digite o seu ultimo salario: ");
        String s3 = entrada.nextLine().replace("," , ".");

        // encerrando o Scanner pois o mesmo nao sera mais necessario
        entrada.close();

        //Converte as Strings em Double
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);
        Double d3 = Double.parseDouble(s3);

        Double media = (d1 + d2 +d3) /3;

        System.out.printf(
            "A media do seu salário nos ultimos 3 meses foi de %2f", media);

    }
}
