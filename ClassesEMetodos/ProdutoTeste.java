package ClassesEMetodos;

public class ProdutoTeste {
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.nome = "Suco de Laranja";
        p1.preco = 4.50;
        p1.desconto = 0.05;

        var p2 = new Produto();
        p2.nome = "Chocolate";
        p2.preco = 8.0;
        p2.desconto = 0.22;

        double preco1 = (p1.preco * (1 - p1.desconto));
        double preco2 = (p2.preco * (1 - p2.desconto));

        System.out.printf("Valor final do %s: %2f",p1.nome, preco1);
        System.out.printf("Valor final do %s: %2f",p2.nome, preco2);
    }
}
