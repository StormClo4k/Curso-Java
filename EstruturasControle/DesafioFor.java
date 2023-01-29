package EstruturasControle;

public class DesafioFor {
    public static void main(String[] args) {
        //Não posso usar valores numericos para controlar laço

        String x = "#";
        for(boolean i = true; i != false;){
            
            System.out.println(x);
            x += "#";

            if(x.equals("######")){
                i = false;
            }
        }

        for(String i = "#"; !i.equals("######"); i += "#"){
            System.out.println(i);
        }
        
    }
}
