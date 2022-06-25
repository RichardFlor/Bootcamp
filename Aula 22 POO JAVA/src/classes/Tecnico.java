package classes;

public final class Tecnico extends Aluno {
    //Atributos
    private int registroProfissional;

    //Métodos Especiais 
    public void praticar(){
        System.out.println("O tecnico " + this.getNome() +" esta praticando o que foi aprendido em sala ");
    }

    //Getters e Setters
    public int getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
