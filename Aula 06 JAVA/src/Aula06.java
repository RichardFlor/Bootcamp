public class Aula06 {
    public static void main(String[] args) throws Exception {
       
        /*
            && AND (E)
            || OR (OU)
            ! NOT (NEGAÇÃO, NÃO) inverte!!
         */
        /*    TABELA VERDADE 
               A         B          A&&B        A || B          !
             true      false        false        true           
             true      true         true         true
             false     false        false        false
             false     true         false        true
        
         */

         //Credencias para logar 
         String usuario = "Meu git";
         String senha = "123";

         //Usuario digitou na tela de login
         String usuarioDigitado = "Meu git";
         String senhaDigitada = "123"; 
         //

        // &&
         boolean loginCorreto = usuarioDigitado == usuario && senhaDigitada == senha;
         System.out.println(loginCorreto);

        // ||
         int idUsuario = 10;
         boolean numero = idUsuario == 10 || idUsuario == 5;
         System.out.println(numero);

        // !
        boolean resultado = !(usuarioDigitado == usuario);
        System.out.println("Resultado: " + resultado);



    }
}
