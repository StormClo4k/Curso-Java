package EstruturasControle;

public class Switch {
    public static void main(String[] args) {

        String faixa = "da";
        switch(faixa.toLowerCase()){
        case "preta":
            System.out.println("Sei dar mortal!");
        case "marrom":
            System.err.println("Sei dar golpes fortes");
        case "vermelha":
            System.out.println("Sei chutar");
        case "branca":
            System.out.println("Sei cair sem me machucar");
        case "sem faixa":
            System.out.println("Não sei fazer nada");
        break;
        default:
            System.out.println("A faixa informada não existe");
        }
        System.out.println("Fim!");
    }
}
