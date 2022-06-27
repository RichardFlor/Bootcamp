import classes.Animal;
import classes.Arara;
import classes.Ave;
import classes.Cachorro;
import classes.Canguru;
import classes.Cobra;
import classes.GoldFish;
import classes.Mamifero;
import classes.Peixe;
import classes.Reptil;
import classes.Tartaruga;

public class App {
    public static void main(String[] args) throws Exception {
       // Animal animal = new Animal(); -- Abstract o objeto nao pode ser instanciado
       Mamifero mamifero = new Mamifero();
       Reptil reptil = new Reptil();
       Peixe peixe = new Peixe();
       Ave ave = new Ave();
       Canguru canguru = new Canguru();
       Cachorro cachorro = new Cachorro();
       Cobra cobra = new Cobra();
       Tartaruga tartaruga = new Tartaruga();
       GoldFish goldFish = new GoldFish();
       Arara arara = new Arara();

    
       mamifero.setPeso(35.3f);
       mamifero.setCorPelo("Preto");
       mamifero.alimentar();
       mamifero.locomover();
       mamifero.emitirSom();

       canguru.locomover();  //Método sobreposto 
       cachorro.locomover(); //Método sobreposto 
       cachorro.emitirSom(); //Método sobreposto
       canguru.emitirSom();  //Método padrão


    }
}
