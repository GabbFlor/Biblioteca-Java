package src;

public class Livro extends Item {
    private int numeroDePaginas;
    private String genero;

    //constructor da classe filho "Livro"
    public Livro(String titulo, String autor, int ano, boolean emprestado, int numeroDePaginas, String genero) {
        super(titulo, autor, ano, emprestado);
        this.numeroDePaginas = numeroDePaginas;
        this.genero = genero;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarDetalhes() {
        System.out.println("INFORMACOES DO LIVRO:");
        System.out.println("Numero de paginas: " + numeroDePaginas);
        System.out.println("Gênero: " + genero);
        super.mostrarDetalhes();
    }
}
