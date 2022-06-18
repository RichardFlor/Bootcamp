import classes.ControleRemoto;

public class App {
    public static void main(String[] args) throws Exception {

        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.ligar();
        controleRemoto.maisVolume();
        controleRemoto.play();
        controleRemoto.abrirMenu();
        controleRemoto.fecharMenu();

    }
}
