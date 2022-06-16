import classes.PingPong;
import classes.TiroAoAlvoOnline;
import classes.VideoGame;
import classes.Xadrez;

public class App {
    public static void main(String[] args) throws Exception {
        // Encapsulamento  -> Interface
       

        VideoGame xBoxOne = new VideoGame();
        xBoxOne.ligar();
        xBoxOne.jogar(new TiroAoAlvoOnline());
        xBoxOne.fechar();
        
    }
}
