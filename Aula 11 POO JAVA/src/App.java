public class App {
    public static void main(String[] args) throws Exception {
       Personagem personagem = new Personagem();
       personagem.nome = "Rimiru";
       personagem.nivel = 2;
       personagem.forca = 16;

      // System.out.format("Personagem: %s (lv %d) com %d de forca.", personagem.nome, personagem.nivel, personagem.forca);
      //chamando o método
     // personagem.mostrarStatus();

      // chmaei o método atacar e passei como argumento uma string "Veldanava"
      //personagem.atacar("Veldanava", "Deus do trovão");

      personagem.bater("Veldanava", "Deus do trovão");

      
    
    }
}
