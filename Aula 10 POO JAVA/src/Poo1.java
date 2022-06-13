import java.util.concurrent.CancellationException;

public class Poo1 {
    public static void main(String[] args) throws Exception {
        // iphone 12, tela de 6.1", 256gb
        // galaxy Note 20 Ultra, tela de 6.9", 256gb
        // xiaomi mi 11 pro, tela de 6.81", 128gb

        
        // Declarando um objeto do tipo Celular = Instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        Celular celularB = new Celular(); // Objeto celularB
        celularB.nome = "galaxy Note 20 Ultra"; // com o estado de nome definido para "Galaxy Note 20 ultra"
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC; // Declarando um objeto chamado celularC
        celularC = new Celular();
        celularC.nome = "xiaomi mi 11 pro";
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";


        System.out.format("Celular %s com tela de %.1f, com %dgb e Sistema Operacional %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e Sistema Operacional %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e Sistema Operacional %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);
        
    }
}
