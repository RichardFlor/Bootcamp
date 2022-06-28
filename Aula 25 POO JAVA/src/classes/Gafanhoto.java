package classes;

public class Gafanhoto  extends Pessoa{
    
    //Atributos
    private String login;
    private int totalAssistido;

    //Construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    //Getters e Setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotalAssistido() {
        return totalAssistido;
    }
    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto [" + super.toString() + "login=" + "\n, totalAssistido=" + totalAssistido + "]";
    }

   

    
    
}
