package Desafios;

public class DesafioAritmedicos {
    public static void main(String[] args) {
        
        int num1 = 6 * (3 + 2);
        Double num2 = Math.pow(num1, 2) / (3 * 2);

        int num3 = ((1 - 5) * (2 - 7)) / 2;
        Double num4 = Math.pow(num3, 2);

        Double num5 = num2 - num4;
        Double resposta = Math.pow(num5 , 3) 
        / Math.pow(10, 3);

        System.out.println(resposta);
    }
}
