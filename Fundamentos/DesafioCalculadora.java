package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //ler num1
        //ler num2
        //ler a operacao(+ - / * %)

        Scanner leitor = new Scanner(System.in);

        Double num1 = leitor.nextDouble();
        Double num2 = leitor.nextDouble();

        var op = leitor.next();

        leitor.close();

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;
        
        System.out.println(resultado);
        
    }
}
