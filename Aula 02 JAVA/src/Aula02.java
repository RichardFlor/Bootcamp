import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aula02 {
    public static void main(String[] args) {
        /** 
         
        int numero; // float, double etc 
        String jogo;
        //Scanner -> classe
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um \nnúmero: ");
        numero = leitor.nextInt(); // nextFloat, nextDouble etc

        System.out.println("Número é " + numero);

        **/

        /** 
        String jogo;
        //CRIO UM OBJETO LEITOR PARA LER VALORES DIGITADOS NO TECLADO
        Scanner leitor = new Scanner(System.in);
        //CONFIGURANDO (DEFINO QUE OS SEPARADORES SÃO: \r OU \n)
        leitor.useDelimiter("[\r\n]+");

        System.out.println("Qual o seu jogo do momento: ");

        jogo = leitor.next();

        System.out.println("Jogo é " + jogo + ", entendeu?");
        **/


        /**  
        String elo;
        int tier; // Integer -> Integer.parseInt(string)
        //float -> Float -> Float.parseFloat(string)
        //double -> Double -> Double.parseDouble(string)
        String valor;

        //CRIO UM OBJETO LEITOR PARA LER VALORES DIGITADOS NO TECLADO
        Scanner leitor = new Scanner(System.in);
        //CONFIGURANDO (DEFINO QUE OS SEPARADORES SÃO: \r OU \n)
        //leitor.useDelimiter("[\r\n]+");

        System.out.println("Qual o seu elo? ");
        elo = leitor.nextLine();

        System.out.println("Qual o seu tier? ");
        valor = leitor.nextLine();
        tier = Integer.parseInt(valor);
       // tier = leitor.nextInt();

       System.out.println("Valor = " + (tier + 1));

        // System.out.println("Qual o seu campeão preferido? ");
        // String campeao = leitor.nextLine();

        // System.out.println("Você é mono " + campeao + " no elo " + elo + " " + tier );

       **/


       String filme = JOptionPane.showInputDialog(null, "Qual o seu filme preferido 2022 até o momento", "Filme preferido", JOptionPane.QUESTION_MESSAGE);
       String texto = JOptionPane.showInputDialog(null, "Digite um numero: ");
       int numero = Integer.parseInt(texto);
       numero = numero * 10;

       JOptionPane.showMessageDialog(null, "Filme preferido: " + filme, "Sei la ", JOptionPane.INFORMATION_MESSAGE);
       System.out.println(filme);
       System.out.println(numero);




    }
}
