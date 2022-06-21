import classes.Livro;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa[] pessoa = new Pessoa[2];
        Livro [] livro = new Livro[3];

        pessoa[0] = new Pessoa("Richard", 21, "M");
        pessoa[1] = new Pessoa("Matheus", 21, "M");

        livro[0] = new Livro("Aprendendo JAVA", "Pedro Alvares", 300, pessoa[0]);
        livro[1] = new Livro("POO", "Alvares", 259, pessoa[1]);
        livro[2] = new Livro("JAVA POO", "Jaiminho o Carteiro", 453, pessoa[0]);

        livro[0].abrir();
        livro[0].folhear(299);
        System.out.println(livro[0].detalhes());
        
    }
}
