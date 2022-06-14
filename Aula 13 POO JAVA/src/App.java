public class App {
    public static void main(String[] args) throws Exception {
        // private
        //public
        //protected
        //default -> package-private -> pacote privado
        /* 
        FestaVip festaVip = new FestaVip();
        festaVip.quantidadeToddy = 20;
        festaVip.entrar();
        */


        ContaNetflix conta = new ContaNetflix();
        conta.entrar();
        conta.assistirFilme("Venom 2");
    }
}
