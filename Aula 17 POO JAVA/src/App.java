import classes.ContaBanco;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1);
        pessoa1.setDono("Richard");
        pessoa1.abriConta("CC");

       
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(2);
        pessoa2.setDono("Matheus");
        pessoa2.abriConta("CP");

        pessoa1.depositar(100);
        pessoa2.depositar(500);

        pessoa2.sacar(100);

        pessoa1.sacar(150);
        pessoa1.fecharConta();

        pessoa1.estadoAtual();
        pessoa2.estadoAtual();

        
    }
}
