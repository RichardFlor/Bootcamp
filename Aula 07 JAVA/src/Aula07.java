public class Aula07 {
    public static void main(String[] args) throws Exception {
        
        /*
            > maior que
            < menor que
            <= menor ou igual a 
            >= maior ou igual a 
            == igual
            != diferente de

            && - AND (E)
            || - OR (ou)
            !  - NOT (NÂO)
         */

            /* 
        int poderDeLuta = 2000;
        if(poderDeLuta > 8000){
            System.out.println("O poder de luta dele é mais de 8000!");
        }

        boolean estaChovendo = false;
        boolean temGuardaChuva = false;
        // IF - SE
        if (estaChovendo == true && temGuardaChuva == true){ // Condição 1
            //Executa tudo que estiver aqui caso seja TRUE
            System.out.println("Muito bem, nao vai se molhar hoje!");
        } else if(estaChovendo == true){ // Condição 2
            //Executa caso a condição anterior for FALSE, e a condeção do ELSE IF for TRUE
            System.out.println("Você pode brincar na chuva!");
        }else{ // Condição 3
            System.out.println("Não esta chovendo!");
        }
             */

            
            /*
        String corFruta = "vermelho";

        if(corFruta == "vermelho"){
            System.out.println("Está madura");
        } else if(corFruta == "amarelo"){
            System.out.println("Está quase madura");
        } else if ( corFruta == "verde"){
            System.out.println("Não esta boa para comer");
        } else{
            System.out.println("Não come! está podre");
        }
             */

        //Ternário
        String video = "Overlord";
        String categoria = (video == "HunterXHunter") ? "anime" : "série";
     
            System.out.println(categoria);

    }
}
