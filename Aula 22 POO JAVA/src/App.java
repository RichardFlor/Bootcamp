import classes.Aluno;
import classes.Bolsista;
import classes.Professor;
import classes.Tecnico;
import classes.Visitante;

public class App {
    public static void main(String[] args) throws Exception {

        /* 
        //Herança Pobre
        Visitante visitante = new Visitante();
        visitante.setNome("Richard");
        visitante.setIdade(21);
        visitante.setSexo("Masc");
        System.out.println(visitante.toString());
        */

        //Herança pra diferença
        Aluno aluno = new Aluno();
        aluno.setNome("Matheus");
        aluno.setMatricula(1);
        aluno.setCurso("Informatica");
        aluno.setIdade(21);
        aluno.setSexo("Masc");
        aluno.pagarMensalidade();

        Bolsista bolsista = new Bolsista();
        bolsista.setMatricula(2);
        bolsista.setNome("Richard");
        bolsista.setBolsa(12.5f);
        bolsista.setSexo("Masc");
        bolsista.pagarMensalidade();
      
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Sei lá");
        tecnico.setRegistroProfissional(1235);
        tecnico.praticar();

        Professor professor = new Professor();
        professor.setNome("Malvado");
        professor.setEspecialidade("Matemática");
        professor.setSalario(1000);
        professor.receberAumento();
    }
}
