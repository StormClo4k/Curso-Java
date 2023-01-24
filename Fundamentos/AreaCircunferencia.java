package Fundamentos;

public class AreaCircunferencia{
    public static void main (String[] args){
        /*
         * A formula da Area da circunferencia equivale
         * a A área de um círculo é pi vezes o raio elevado ao quadrado
         *(A = π r²). 
         */

         double raio = 3.4;
         final double pi = 3.14159265359;
         double area = pi * (raio * raio);

         System.out.println("Area = " + area + "m2");

    }
}