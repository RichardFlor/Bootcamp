import classes.Aluno;
import classes.Funcionario;
import classes.Pessoa;
import classes.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa1 = new Pessoa();
        Aluno pessoa2 = new Aluno();
        Professor pessoa3 = new Professor();
        Funcionario pessoa4 = new Funcionario();

        pessoa1.setNome("Richard");
        pessoa2.setNome("Matheus");
        pessoa3.setNome("Flor");
        pessoa4.setNome("Doroteio");

        pessoa1.setSexo("M");
        pessoa2.setSexo("M");
        pessoa3.setSexo("M");
        pessoa4.setSexo("M");

        pessoa1.setIdade(21);
        pessoa2.setIdade(21);
        pessoa3.setIdade(21);
        pessoa4.setIdade(21);


        pessoa2.setCurso("T.I");
        pessoa3.setSalario(2500.75f);
        pessoa4.setSetor("Gerencia");

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println(pessoa4.toString());

    }
}
