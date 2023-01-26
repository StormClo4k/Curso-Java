package Fundamentos;

public class ConversaoTipos {
    public static void main(String[] args){

        // tipos primitivos
        double a = 1.9284784884; //Conversão implicita
        System.out.println(a);

        float f = (float) 1.9284784884; //Conversão explicita (quando pode ocorrer perda de informações)
        System.out.println(f);

        int i = 4;
        System.out.println(i);

        byte b = (byte) i; //explicita  (CAST)
        System.out.println(b + "\n");

        //String numero -> String

        Integer num = 100;
        System.out.println(num.toString()); // convertendo no console

        int num2 = 200;
        System.out.println(Integer.toString(num2));
        System.out.println(("" + num2).length()); // concatenacao com string vazia tambem converte para string um numero





    
    }
}
