package classes;

public class Visualizacao {
    //Atributos
    private Gafanhoto espectador;
    private Video filme;

    //Construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //Getters e Setters
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }


    @Override
    public String toString() {
        return "Visualizacao [ espectador=" + espectador + ", filme=" + filme + "]";
    }

    //métodos com mesmo nome e assinaturas diferentes, polimorfismo de sobrecarga
    public void avalir(){
        this.filme.setAvaliacao(5);
    }
    
    public void avalir(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avalir(float porcentagem){
        int total = 0;
        if (porcentagem <= 20) {
            total = 3;
        } else if(porcentagem <= 50){
            total = 5;
        } else if(porcentagem <= 90){
            total = 8;
        }else{
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }
    
}
