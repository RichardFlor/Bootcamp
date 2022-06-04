import javax.swing.JOptionPane;

public class Aula05 {
    public static void main(String[] args) throws Exception {
         /*
            > maior que
            < menor que
            >= maior ou igual a
            <= menor ou igaul a 
            == igual a
            != diferente de 

            *****  um igual ( = )  é atribuição 
         
         */
        /* 
            int idade = 20;
            boolean resultado = idade >= 18;
            JOptionPane.showMessageDialog(null, resultado);
       */

        /* 
            String nome = "Richard";
            boolean resultado = nome == "Matheus";
            JOptionPane.showMessageDialog(null, resultado);
        */

        int episodiosVistos = 420;
        int totalEpisodios = 500;

        boolean acabou = episodiosVistos == totalEpisodios;
        JOptionPane.showMessageDialog(null,acabou);

    }
}
