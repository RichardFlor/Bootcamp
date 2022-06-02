import javax.swing.JOptionPane;

public class Aula03 {
    public static void main(String[] args) {

        // int numeroA = 5;
        // int numeroB = 
        //int resultado = 2 * 10;
        //double resultado = (double)5 / 2; 
        //int resultado = 11 % 2; // Pra saber se o numero é par ou impar ou multiplo de 10
        //JOptionPane.showMessageDialog(null, resultado, "Matemática", JOptionPane.INFORMATION_MESSAGE);

        /** //BLOCO 1
        int contador = 0;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador = contador + 1;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador++; // serve para subtração também
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador += 2; // contador = contador + 2... serve com subtração multiplicação, divisão e com mod ( % )  também
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        **/


        /** //BLOCO 2
        int contador = 1;

        //++ contador = contador + 1
        // imprimir o novo calor do contador 

        //contador++
        //imprimir p valor antigo
        //contador = contador + 1
        JOptionPane.showMessageDialog(null, contador++, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ++contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        **/


        /** //BLOCO 3
        int resultado = 2 * 5 + 3 * 4 - 8;
        //int resultado = 2 * (5 + 3 )* 4 - 8; // igual á 56
        //int resultado = 2 * ((5 + 3 )* 4 - 8); // igual á 48
        JOptionPane.showMessageDialog(null, resultado);
        **/


        int numeroA = -5;
        int numeroB = 6;

        //int resultado = Math.abs(numeroA); // abs pega o valor absoluto, exemplo pega o valor negativo e retorna positivo
        //int resultado = (int) Math.pow(numeroA, 2); // 10^2 (dez elevado a 2)....(int) na frente para forçar a ser convertido pra inteiro 
        //int resultado = (int) Math.sqrt(4); // sqrt é raiz quadrada
        //double resultado =  Math.ceil(10.54); //ceil é pra arredondar numero para cima 
        //double resultado =  Math.floor(10.54); //floor é pra arredondar numero para baixo 
        //double resultado =  Math.min(numeroA, numeroB); // retorna o menor valor entre os dois valores passados 
        double resultado =  Math.max(numeroA, numeroB); // retorna o maior valor entre os dois valores passados 

        JOptionPane.showMessageDialog(null, resultado);

    }
}
