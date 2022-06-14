import classes.Conta;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        //modificar -> setNomeVariavel
        //pegar -> getNomeVariavel

        pessoa.setNome("Matheus");
        pessoa.setAltura(1.9);
        pessoa.setIdade(20);
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(200);
        System.out.println(conta.getSaldo());
    }
}
