import java.util.Random;

import javax.swing.JOptionPane;

public class Aula04 {
    public static void main(String[] args) {
        
        /**BLOCO 1 

        int dado6Faces =   1 + (int) (Math.random() * 6);
        //JOptionPane.showMessageDialog(null, dado6Faces);

        Random gerador = new Random(); // recomendado por ter melhor desempenho
        int numero = gerador.nextInt(6) + 1; // 6 é o maior número e 1 é o valor minimo
        JOptionPane.showMessageDialog(null, numero);
        **/

        Random gerador = new Random(); 

        String facesString = JOptionPane.showInputDialog(null, "Quantas faces tem o dado? ");
        int facesDado =  Integer.parseInt(facesString);

        int resultado = 1 + gerador.nextInt(facesDado);

        JOptionPane.showMessageDialog(null,"Você tirou " + resultado + " no dado!!");

    }
}
