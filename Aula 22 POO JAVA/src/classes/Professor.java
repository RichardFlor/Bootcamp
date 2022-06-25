package classes;

public final class Professor extends Pessoa{
    private String especialidade;
    private int salario;

    public void receberAumento(){
        this.salario = salario + 1000;
        System.out.println("O professor "+this.getNome()+", recebeu um aumento no salário, agora o seu salario é de: " + getSalario()+" reais.");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
