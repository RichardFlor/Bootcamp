import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    /* 

    // void significa que não esta retornando nada 
    //Declarando o método
    void mostrarStatus() {
        System.out.format("Personagem: %s (lv %d) com %d de forca.\n", nome, nivel, forca);

    }
    */

    /* 

    //método que nao retorna nada e recebe um parametro alvo que é do tipo String
    //Métodos com varios parametros
    void atacar(String alvo, String habilidade){
        // "" o tamanho (.length) é igual a 0
        if(habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, forca);
        } else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n",
                                         nome, habilidade, alvo, forca);
        }
    }
    */


    int calcularDano(){
        Random gerador = new Random();
        // 1 ... 20
        // nextInt(); de 0 até 19
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    void bater(String alvo, String habilidade){
        int danoCausado = calcularDano();
        // "" o tamanho (.length) é igual a 0
        if(habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n",
                                         nome, habilidade, alvo, danoCausado);
        }
    }






}
