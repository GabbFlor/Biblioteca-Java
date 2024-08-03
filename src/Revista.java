package src;

public class Revista extends Item {
    private int numeroDeEdicao;
    private String mesDePublicacao;

    public Revista(String titulo, String autor, int ano, boolean emprestado, int numeroDeEdicao, String mesDePublicacao) {
        super(titulo, autor, ano, emprestado);
        this.numeroDeEdicao = numeroDeEdicao;
        this.mesDePublicacao = mesDePublicacao;
    }

    public int getNumeroDeEdicao() {
        return numeroDeEdicao;
    }

    public void setNumeroDeEdicao(int numeroDeEdicao) {
        this.numeroDeEdicao = numeroDeEdicao;
    }

    public String getMesDePublicacao() {
        return mesDePublicacao;
    }

    public void setMesDePublicacao(String mesDePublicacao) {
        this.mesDePublicacao = mesDePublicacao;
    }

    public void mostrarDetalhes() {
        System.out.println("INFORMACOES DA REVISTA:");
        System.out.println("Numero de edicao: " + numeroDeEdicao);
        System.out.println("Mes de publicacao: " + mesDePublicacao);
        super.mostrarDetalhes();
    }
}
