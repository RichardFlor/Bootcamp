package classes;

public class Mamifero extends Animal{
    //Atributos
    protected String corPelo;


    //Método abristato
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
