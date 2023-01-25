package Fundamentos;

public class TipoString {
    public static void main(String[] args){
        String s = "Boa noite";
        System.out.println(s.concat("!!!")); // concatenacão
        System.out.println(s.startsWith("Boa"));    // teste logico (se inicia com...)
        System.out.println(s.length());         // tamanho do array
        System.out.println(s.toLowerCase());    // letras minusculas
        System.out.println(s.toUpperCase());    // letras maiusculas
        System.out.printf("%s João, %s Marcia", s, s); // print formatado %s = string %d = double...
    }
}
