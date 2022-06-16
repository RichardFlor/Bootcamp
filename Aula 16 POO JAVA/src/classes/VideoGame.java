package classes;

public class VideoGame {
    private boolean estaLigado; // false é o valor padrao de um boolean
    private Jogo jogo; // null

    public void ligar(){
        System.out.println("Ligando o video-game...");
        this.estaLigado = true;
    }

    public void jogar(Jogo jogo){
        if(estaLigado){ 
        System.out.println("Iniciando o jogo....");
        this.jogo = jogo;
        jogo.jogar();
        }else{
            System.out.println("VideoGame esta desligado");
        }
    }

    public void fechar(){
        if(estaLigado == true){ 
            System.out.println("Fechando o jogo");
            boolean temJogoRodando = jogo != null;
            if(temJogoRodando){
                jogo.fechar();
                jogo = null; //Definindo o valor de null que significa que nao esta rodando
            }else{
            System.out.println("Não tem nenhum jogo rodando!");
             }
            }else{
                System.out.println("VideoGame esta desligado");
            }    
    }
}
