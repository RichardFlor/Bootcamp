package classes;

public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;


    
 

    //Métodos Especiais
    public void cancelarMatricula(){
        System.out.println("A matrícula será cancelada!!");
    }


    //Getters e Setters
    
    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

  
}
