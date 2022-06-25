package classes;

public final class Bolsista extends Aluno {
    //Atributos
    private float bolsa;
    //Métodos Especiais
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa do aluno" + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!!");
    }

    //Getters e Setters
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
