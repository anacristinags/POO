// EXERCICIO 20 - AULA 11

import java.util.ArrayList;

public class TesteLivro {

    public static void main(String[] args) {
        // criando arrayList e adicionando objs nele
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Harry Potter", "J. K. Rowling", 2));
        livros.add(new Livro("O Príncipe", "Maquiavel", 3));
        livros.add(new Livro("Meditações", "Marco Aurélio", 1));

        // chamando método estático para emprestar o livro (pelo index)
        Livro.emprestarLivro(livros.get(0));
        Livro.emprestarLivro(livros.get(2));

        // chamando método estático para emprestar o livro (pelo nome)
        Livro.emprestarLivro("O Príncipe", livros);

        // chamando método estático para verificar disponibilidade
        Livro.verificarDisponibilidade("harry potter", livros);
        Livro.verificarDisponibilidade("Meditações", livros);
    }
}
