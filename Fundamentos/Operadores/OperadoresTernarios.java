package Fundamentos.Operadores;

public class OperadoresTernarios {
    public static void main (String[] args){

        // ternario e uma atribuicao condicional

        double nota = 7.4;
        boolean comportamento = true;

        //nota for maior que 7 = true(vai retornar aprovado) se n reprovado
        String resultado = nota >= 7.0 ? "Aprovado!" : "Reprovado!";

        boolean passouMedia = nota > 7;
        boolean desconto = passouMedia && comportamento;
        String rDesconto = desconto ?"Sim" : "Não";


        System.out.println("O aluno está " + resultado);
        System.out.println("Aluno possui desconto? " + rDesconto);

    }
}
