import src.*;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        Item livro1 = new Livro(
                "Livro foda",
                "Florindo",
                1999,
                false,
                200,
                "Aventura");
        Item revista1 = new Revista(
                "Quadrinhos",
                "Flor",
                2015,
                true,
                9999,
                "setrembeiro");
        Item dvd1 = new Dvd(
                "Flor gravado",
                "Floras florais",
                9999,
                false,
                8001,
                "Acao"
        );

        Cliente user1 = new Cliente(
                "Gabriel F",
                "flor@gmail.com",
                "11 970441052",
                "casa legal"
        );

        //emprestar os items para o usuário
        user1.emprestarItem(livro1);
        user1.emprestarItem(dvd1);

        //caso queira devolver
        //user1.devolverItem(livro1);

        Funcionario func1 = new Funcionario(
                "Flor",
                "asdas@gmail.com",
                "123123",
                "puto"
        );

        //livro1.mostrarDetalhes();

        //revista1.mostrarDetalhes();

        //dvd1.mostrarDetalhes();

        user1.mostrarInfos();

        //func1.mostrarInfos();
    }
}
