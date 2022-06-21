package classes;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;


    //Métodos Publicos 
    public String detalhes() {
        return "Livro " + "[\n, titulo= " + titulo  + "\n, aberto= " +  aberto + "\n, autor= " + autor + "\n, leitor= " + leitor.getNome()
                                 +  ", idade= " + leitor.getIdade() +  ", sexo= " + leitor.getSexo() 
                                +  "\n, paginaAtual= " + paginaAtual + ", totalPaginas= " + totalPaginas + "]";
    }


    //Método Construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas; 
        this.leitor = leitor;
        this.aberto = false;
        this.paginaAtual = 0;
    }

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    //Métodos Abstratos
    public void abrir() {    
        this.aberto = true;
    }

    public void fechar() {
        this.aberto = false;
    }

    public void folhear(int pagina) {
        if( pagina > this.totalPaginas){
            this.paginaAtual = 0;
        } else{
        this.paginaAtual = pagina;
        }
    }

    public void avancarPagina() {
        this.paginaAtual++;
    }

    public void voltarPagina() {
        this.paginaAtual--;
    }
}
