package Fundamentos.Operadores;

public class DesafioLogico {
    public static void main(String[] args) {
        
        //Trabalho na terça (V ou F)
        //Trabalho na quinta (V ou F)

        Boolean trabalho1 = true;
        Boolean trabalho2 = false;

        //valida se a familia vai comprar a tv 50 polegadas
        System.out.println(trabalho1 && trabalho2);

        //valida se a familia vai comprar a tv de 32 polegadas
        System.out.println(trabalho1 ^ trabalho2);

        //valida se a familia ira tomar sorvete?
        System.out.println(trabalho1 || trabalho2);

        //valida se a familia ficara em casa sem a tv nova
        System.out.println(!(trabalho1 || trabalho2));
        // caso eu tivesse feito em variaveis, poderia fazer essa verificacao
        //atravez da negacao de "familia ira tomar sorvete?"



    }
}
