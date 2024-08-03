package src;

public class Dvd extends Item {
    private int duracao;
    private String genero;

    public Dvd(String titulo, String autor, int ano, boolean emprestado, int duracao, String genero) {
        super(titulo, autor, ano, emprestado);
        this.duracao = duracao;
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarDetalhes() {
        System.out.println("INFORMAÇÕES DO DVD:" +
                            "\nGenero: " + genero +
                            "\nDuracao: " + duracao);
        super.mostrarDetalhes();
    }
}
