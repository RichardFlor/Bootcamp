package classes;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos Públicos
    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2){
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3); // 0, 1 ,2 
            System.out.println("----- Resultado da luta -----");
            switch(vencedor){
                case 0: // Empate 
                    System.out.println("-------------");
                    System.out.println("Empatou!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("-------------");
                break;
                case 1: // Desafiado vence
                    System.out.println("-------------");
                    System.out.println("Venceu a luta " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("-------------");
                break;
                case 2: // Desafiante vente
                    System.out.println("-------------");
                    System.out.println("Venceu a luta " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    System.out.println("-------------");
                break;
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    //Métodos Especiais 
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
    
}
