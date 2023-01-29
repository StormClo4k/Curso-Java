package Fundamentos.Operadores;

public class OperadoresLogicos {
    public static void main(String[] args){

        Boolean condicao = true;
        Boolean condicao2 = 3 > 7;

        System.out.println(condicao && condicao2);
        System.out.println(condicao || condicao2);
        System.out.println(condicao ^ condicao2);
        System.out.println(!!condicao);
        System.out.println(!condicao2);

        //Tabela verdade (&&)
        System.out.println(true && true);
        System.out.println(true && false);
        //System.out.println(false && true);
        //System.out.println(false && false);

        //Tabela verdade (||)
        //System.out.println(true || true);
        //System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //Tabela verdade (^) "ou exclusivo (XOR)"
        /*O mesmo não tem advertencias pois ele precisa analisar 
         * todos os cenario para saber se a sentenca é vendadeira
         * ou falsa*/
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //Tabela verdade Not \n
        System.out.println(!true);
        System.out.println(!false);
    }
}
