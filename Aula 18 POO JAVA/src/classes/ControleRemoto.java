package classes;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
   

    //Métodos Construtores
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }



    //Métodos getters e setters
    private int getVolume() {
        return volume;
    }


    private void setVolume(int volume) {
        this.volume = volume;
    }


    private boolean getLigado() {
        return ligado;
    }


    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


    private boolean getTocando() {
        return tocando;
    }


    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }



    //Métodos Abstratos
    public void ligar() {
       this.setLigado(true);
        
    }


    public void desligar() {
        this.setLigado(false);
        
    }


    public void abrirMenu() {
        System.out.println("-----MENU-----");
       System.out.println("Esta ligado? " + this.getLigado());
       System.out.println("Esta tocando? " + this.getTocando());
       System.out.print("Volume: " + this.getVolume());
       for (int i = 0; i <= this.getVolume(); i+=10 ){
            System.out.print(" |");
       }
       System.out.println("");
        
    }


    public void fecharMenu() {
      System.out.println("Fechando Menu...");
        
    }


    public void maisVolume() {
      if(this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
      }else{
        System.out.println("Impossivel aumentar volume");
      }
        
    }

   
    public void menosVolume() {
      if (this.getLigado() == true){
            this.setVolume(this.getVolume() - 5);
      }else{
        System.out.println("Impossivel diminuir volume");
      }
        
    }


    public void ligarMudo() {
     if(this.getLigado() && this.getVolume()> 0){
            this.setVolume(0);
     }
        
    }
 
    public void desligarMudo() {
       if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
       }
        
    }
   
    public void play() {
      if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
      } else{
        System.out.println("Impossivel reproduzir!");
      }
        
    }

    public void pause() {
    if(this.getLigado() && this.getTocando()){
        this.setTocando(false);
      } else{
        System.out.println("Impossivel pausar!!");
      }
        
    }

}
