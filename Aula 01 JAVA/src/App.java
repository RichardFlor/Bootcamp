public class App {
    
    public static void main(String[] args) {
    //VARIAVEIS DO TIPO INTEIRO
        // tipo nome;
        byte numeroPequeno = 127;
        short numeroShort = 32767;
        int numeroMaior = 2147483647;
        long numeroEnorme = 922337203685477000l; // L minusculo no final pra que é um long

    //VARIAVEIS DO TIPO PONTO FLUTUANTE
        float peso = 78.7f; // F minusculo no final para identificar que é um float 
        double pi = 3.14159265358979323846;

    //VARIAVEIS DO TIPO CARACTERE
        char letra = 'R'; // Só consegue salvar apenas um caractere
    
    //VARIAVEL DO TIPO BOOLEANO
        boolean estouComFome = false; // True ou False

    //VARIAVEL DO TIPO STRING
        String nome = "Richard"; // Sempre com aspas duplas, aceita um valor maior que o tipo CHAR

    
    //EXIBIR NO CONSOLE
        System.out.println(numeroPequeno);
        System.out.println(numeroShort);
        System.out.println(numeroMaior);
        System.out.println(numeroEnorme);
        System.out.println(peso);
        System.out.println(pi);
        System.out.println(letra);
        System.out.println(estouComFome);
        System.out.println(nome);

    //AULA DOIS 
        //public class e public static o mesmo do começo!!!

    String nomeCompleto; // Declarando
    nomeCompleto = "Richard Flor"; // Inicializando a variável

    String filme = "Vingadores";
    int anoLancamento = 2015; // %d
    int duracao = 240; // %d
    double notaCritica = 8.7; 
    float notaPublico = 9.5f; // %f
    char letraInicial = 'V'; // %c
    boolean foiSucesso = true; // %b


    System.out.println(nomeCompleto); // Usando a variável

  

    System.err.println("O filme " + filme); // exibida com formato de erro
    System.out.println("Ano de lançamento: " + anoLancamento);
    System.out.println("A duração do filme é: " + duracao);
    System.out.println("A nota critica foi: " + notaCritica);
    System.out.println("A nota do publico é: " + notaPublico);
    System.out.println("A letra inicial é: " + letraInicial);
    System.out.println("Foi um sucesso? " + foiSucesso + "!!");

    // O filme <filme> lançado em <ano> tem uma duração de <duracao> minutos.
    System.out.println("O filme " + filme + " lançado em " + anoLancamento + " tem uma duração de " + duracao + " minutos." );

    System.out.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme, anoLancamento, duracao);// nao tem a quebra de linha.. usar o \n para a quebra  
        /// o \n quebra a linha!!
    String texto = "O filme " + filme + " lançado em " + anoLancamento + " tem uma duração de " + duracao + " minutos.";
    System.out.println(texto);

    String texto2 = String.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme, anoLancamento, duracao);
    System.out.println(texto2);


   
    String mensagem = "Assista o máximo ";
    String mensagem2 = "que conseguir ";
    String mensagem3 = "de animes :)";
    int metaLista = 500;

    String mensagemFinal = mensagem + mensagem2 + mensagem3;
    System.out.println(mensagemFinal);

    String mensagemFinal2 = String.format("%s%s%s ... A meta é %d", mensagem, mensagem2, mensagem3, metaLista); //Passar sempre na ordem
    System.out.println(mensagemFinal2);
   
    }
}


