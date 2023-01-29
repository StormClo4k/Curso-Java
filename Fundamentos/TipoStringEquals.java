package Fundamentos;

public class TipoStringEquals {
    public static void main(String[] args) {
        
        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2" == s);

        System.out.println("2" == s.trim()); //trim tira os espacos em branco
        System.out.println("2".equals(s.trim()));  // equals compara se as strings sao iguais

        // nem sempre o operador relacional == vai retornar o valor correto para strings

    }
}
