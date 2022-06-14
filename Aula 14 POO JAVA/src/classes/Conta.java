package classes;

public class Conta {
    private double saldo;

   public void depositar(double valor){
    if(valor < 0){
        System.out.println("Não pode depostitar numero negativo ");
    }else{
        saldo = saldo + valor;
    }
}

   public double getSaldo(){
        return saldo;
    }
}
