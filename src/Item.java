package src;

public class Item {
    private String titulo;
    private String autor;
    private int ano;
    private boolean emprestado;

    public Item(String titulo, String autor, int ano, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = emprestado;
    }

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }



    public void emprestar () {
        this.emprestado = true;
    }

    public void devolver () {
        this.emprestado = false;
    }

    public void mostrarDetalhes () {
        System.out.println( "titulo: " + titulo +
                            "\nautor: " + autor +
                            "\nano: " + ano +
                            "\nemprestado: " + emprestado);
        System.out.println();
    }
}
