package Fundamentos;

public class ConversorTemperatura {
    public static void main(String[] args){

         //*  Formula F = C x 1,8 + 32 (Fahrenheit para Celsius)
         
         double fahrenheit = 30;
         final double conversor = fahrenheit * 1.8 + 32;

         System.out.println("Conversão para Celsius = " + conversor);

    }
}
