package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args){

        // Prints na mesma linha
        System.out.print("bom dia");
        System.out.print("boa tarde");

        System.out.println("");

        // Prints por linha
        System.out.println("BOM DIA");
        System.out.println("BOA TARDE");

        System.out.println("");
        
        String x = "Joao";

        // Prints formatados
        /*  %s	String de caracteres
            %d	Número inteiro decimal
            %u	Número inteiro decimal sem sinal
            %o	Número inteiro octal sem sinal
            %x, %X	Número inteiro hexadecimal sem sinal, minúsculo ou maiúsculo
            %f	Float
            %2f	Double
            %e, %E	Número real, em notação científica, minúsculo ou maiúsculo
            %b	Boolean
            %c	Caractere (char) */
        System.out.printf("%s %n", x); 
        System.out.printf("Mensagem: %d %d %n",1, 2);
        System.out.printf("Salario: %.2f %n", 12.2563);

        //Recebe informacoes de entrada (Teclado)
        Scanner entrada = new Scanner(System.in);
        //Tipo  NomeVar = recebe determinado valor (dentro dos parenteses)

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine(); //Recebe informacoes do proxima string digitada

        System.out.println("Seu nome é " + nome + "!!! %n");

        System.out.print("Informe sua idade: ");
        short idade = entrada.nextShort(); //recebe informacoes do proximo shot digitado
        System.out.printf("a sua idade é %d", idade);

        entrada.close();    /*quando o Scanner for aberto, o mesmo deve ser fechado
                            apos o uso */ 
    }
    
}
