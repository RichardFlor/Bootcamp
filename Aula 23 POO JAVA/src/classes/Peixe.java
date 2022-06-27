package classes;

public class Peixe extends Animal{
    //Atributos
    private String corEscama;

    //Métodos Abstratos
    @Override
    public void locomover() {
       System.out.println("Nadando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
        
    }

    @Override
    public void emitirSom() {
       System.out.println("Peixe não faz som");
        
    }
    //Método
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }

    //Getters e Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
