

public class FestaVip {
    //<modificador ><tipo> <nome-atributo>
    private int quantidadeToddy = 30;
    private int quantidadeSalgados = 50;
    

    public void entrar() {
        beberTody();
        comerSalgado();
        beberTody();
    }


    // <modificador> <retorno-metodo> <nome-método>
    private void beberTody(){
        quantidadeToddy--;
        System.out.println("Bebeu 1 copo de Toddy");
    }

    private void comerSalgado(){
        quantidadeSalgados--;
        System.out.println("Comeu 5 salgados");
    }
}
