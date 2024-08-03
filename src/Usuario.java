package src;

public class Usuario {
    private String nome;
    private String email;
    private String tell;

    public Usuario(String nome, String email, String tell) {
        this.nome = nome;
        this.email = email;
        this.tell = tell;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public void mostrarInfos() {
        System.out.println( "Nome: " + nome +
                            "\nEmail: " + email +
                            "\nTelefone: " + tell);
        //System.out.println();
    }
}
