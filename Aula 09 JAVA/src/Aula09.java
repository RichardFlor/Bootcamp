import java.util.Arrays;

import javax.swing.JOptionPane;

public class Aula09 {
    public static void main(String[] args) throws Exception {
        // armazenar vários valores do mesmo tipo
        // tipo[] nomeVariavel = new tipo[5];
        // sempre que criar um vetor tem que passar a quantidade 

        /* 
        String [] nomes = new String[]{
            "Naruto", "Sasuke", "Goku", "Kirito", "Rimuru"
        }; // Cria o vetor
        for(int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++){
            System.out.print(nomes[posicaoVetor] + " ");
        }
        */

        /* 
        int[] numeros = new int[100];

        for (int posicao = 0; posicao < 100; posicao++){
            numeros[posicao] = 0;
        }
            System.out.println(numeros[50]);
        */


        //Preenchendo o array com um valor
        /* 
        int[] numeros = new int[100];

        Arrays.fill(numeros, 0);

        System.out.println(Arrays.toString(numeros));
        */


        Object[] opcoes = new String[]{
            "Anime HxH",
            "Série Rick and Morty",
            "Filme Vingadores",
            "Sair"
        };
        int opcaoEscolhida = 0;
        
        while(opcaoEscolhida != 3){
            opcaoEscolhida = JOptionPane.showOptionDialog(
                null,
                 "O que você deseja assistir",
                 "RicFlix",
                 JOptionPane.DEFAULT_OPTION,
                 JOptionPane.QUESTION_MESSAGE,
                 null,
                 opcoes, 
                 0
                 );
                 if (opcaoEscolhida != 3){
                    String mensagem = "você assistiu: " + opcoes[opcaoEscolhida];
                    JOptionPane.showMessageDialog(null, mensagem);
                 } 
        }
    }
}
