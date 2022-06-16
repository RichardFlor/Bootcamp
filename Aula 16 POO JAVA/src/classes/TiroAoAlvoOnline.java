package classes;

public class TiroAoAlvoOnline implements Jogo{

    
    public void fechar() {
        System.out.println("Salvar o progresso do jogo no servidor ");
        System.out.println("Sair da partida");
        System.out.println("Sair do jogo");
        
    }

    
    public void jogar() {
        System.out.println("Carregando o jogo");
        System.out.println("Conectando-se ao servidor....");
        System.out.println("Carregando partida");
    }
    
}
