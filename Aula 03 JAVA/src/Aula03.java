import javax.swing.JOptionPane;

public class Aula03 {
    public static void main(String[] args) {

        // int numeroA = 5;
        // int numeroB = 
        //int resultado = 2 * 10;
        //double resultado = (double)5 / 2; 
        //int resultado = 11 % 2; // Pra saber se o numero é par ou impar ou multiplo de 10
        //JOptionPane.showMessageDialog(null, resultado, "Matemática", JOptionPane.INFORMATION_MESSAGE);

        int contador = 0;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador = contador + 1;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador++; // serve para subtração também
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador += 2; // contador = contador + 2... serve com subtração multiplicação, divisão e com mod ( % )  também
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);



        /** 
        int contador = 1;

        //++ contador = contador + 1
        // imprimir o novo calor do contador 

        //contador++
        //imprimir p valor antigo
        //contador = contador + 1
        JOptionPane.showMessageDialog(null, contador++, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ++contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        **/
    }
}
