import java.util.Random;

public class Aula08 {
    public static void main(String[] args) throws Exception {
        // While (enquanto)
        // while (<condicao>){}

        /* 
        int contador = 0;
        while(contador < 3){
            System.out.println("Olá");
            contador++; 
        }
        */
        /* 
        int contador = 1;
        while(contador <= 100){
            System.out.println(contador);
            contador++; 
        }
        */
        /* 
        int contador = 1;
        while(contador <= 100){
            System.out.println(contador);
            contador +=2; 
        }
        */
        /* 
        int contador = 400;
        while(contador >= 300){
            System.out.println(contador);
            contador--; 
        } 
        */





        //DO WHILE - verificação no topo assim que começa, verifica pelo menos uma vez
        /*
            do{
                ...
            } while(<condicao>);

         */
        /* 
        int contador = 400;
         do{
            System.out.println(contador);
            contador--;
         }while(contador >= 300);
        */





        //FOR - 
        /*
            for(valorInicial;condição;passo){}
         */
        /* 
        // int contador = 1;
        for(int contador = 1; contador <= 100; contador++) {
            System.out.println(contador);
        }
        */

        Random gerador = new Random();
        int numero = 1 + gerador.nextInt(4);
        while ( numero != 3 ){
            System.out.println("gerou o numero " + numero);
            numero = 1 + gerador.nextInt(4);
        }
        System.out.println("Gerou o numero 3");
    }
}
