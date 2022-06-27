import java.rmi.server.LoaderHandler;

import classes.Animal;
import classes.Cachorro;
import classes.Lobo;
import classes.Mamifero;

public class App {
    public static void main(String[] args) throws Exception {
       // Animal animal = new Animal();  -- É uma classe abstrata e nao pode ser instanciada

       Mamifero mamifero = new Mamifero();
       Lobo lobo = new Lobo();
       Cachorro cachorro = new Cachorro();



       mamifero.emitirSom();
       lobo.emitirSom();
       cachorro.emitirSom();

       cachorro.reagir("oi");
       cachorro.reagir(false);
       cachorro.reagir(11, 45);
       cachorro.reagir(19, 00);
       cachorro.reagir(2, 12.5f);
       cachorro.reagir(17, 4.5f);
    }
}
