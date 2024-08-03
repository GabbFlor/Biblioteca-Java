package src;

public class Funcionario extends Usuario {
    private String cargo;

    public Funcionario(String nome, String email, String tell, String cargo) {
        super(nome, email, tell);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void mostrarInfos() {
        System.out.println("FUNCIONARIO: ");
        super.mostrarInfos();
        System.out.println("Cargo: " + cargo);
    }
}
