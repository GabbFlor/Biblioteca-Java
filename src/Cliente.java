package src;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private String endereco;
    private List<Item> itensEmprestados;

    public Cliente(String nome, String email, String tell, String endereco) {
        super(nome, email, tell);
        this.endereco = endereco;
        this.itensEmprestados = new ArrayList<>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Item> getItensEmprestados() {
        return itensEmprestados;
    }

    public void setItensEmprestados(List<Item> itensEmprestados) {
        this.itensEmprestados = itensEmprestados;
    }

    public void emprestarItem(Item item) {
        itensEmprestados.add(item);
    }

    public void devolverItem(Item item) {
        itensEmprestados.remove(item);
    }



    public void mostrarInfos() {
        System.out.println("CLIENTE:");
        super.mostrarInfos();
        System.out.println("Endereco: " + endereco +
                            "\n\nITENS EMPRESTADOS: \n");
        for (Item item : itensEmprestados) {
            item.mostrarDetalhes();
        }
    }
}
