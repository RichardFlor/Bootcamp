import classes.Luta;
import classes.Lutador;

public class App {
    public static void main(String[] args) throws Exception {
        
       Lutador lutador[] = new Lutador[6];
       
       lutador[0] = new Lutador("Richard", "Brasil", 21, 1.83f, 64.9f, 11, 0, 1);
       lutador[1] = new Lutador("Matheus", "França", 21, 1.83f, 57.8f, 11, 1, 2);
       lutador[2] = new Lutador("Gustavo", "Portugal", 21, 1.83f, 80.9f, 7, 2, 3);
       lutador[3] = new Lutador("Mathias", "Japão", 21, 1.83f, 81.6f, 12, 4, 2);
       lutador[4] = new Lutador("José", "Itália", 21, 1.83f, 119.3f, 15, 4, 1);
       lutador[5] = new Lutador("Sei la", "México", 21, 1.83f, 105.7f, 2, 7, 1);

    // lutador[0].apresentar();
    // lutador[3].status();

        Luta luta = new Luta();
        luta.marcarLuta(lutador[0], lutador[1]);
        luta.lutar();
        lutador[0].status();
        lutador[1].status();
        

    }
}
