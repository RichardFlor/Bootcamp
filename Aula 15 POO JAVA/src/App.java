import javax.swing.JOptionPane;

import classes.Personagem;
//import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       //Pessoa pessoa = new Pessoa("Richard", 21, 1.83f, 60, "Ric", true);
       //pessoa.imprimirDados();

       String nome = JOptionPane.showInputDialog(null, "Nome do Personagem: ");
       String classe = JOptionPane.showInputDialog(null, "Classe do personagem: ");


       Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();
    }
}
