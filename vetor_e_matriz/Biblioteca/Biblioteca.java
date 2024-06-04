/*  EXERCICIO 15 - AULA 10
    Crie um sistema de gerenciamento de uma biblioteca. Para isso, crie as classes
    Livro e Biblioteca. A classe Livro deve ter os atributos titulo, autor e disponivel.
    A classe Biblioteca deve ter um vetor de objetos Livro.
    Implemente métodos na classe Biblioteca para:
    1. Adicionar um novo livro.
    2. Emprestar um livro (marcando-o como indisponível).
    3. Devolver um livro (marcando-o como disponível).
    4. Listar todos os livros com suas informações.
    5. Listar apenas os livros disponíveis.  */

import java.util.Arrays;
import java.util.List;

public class Biblioteca {
    Livro[] livros;  //vetor de obj livro
    int i = 0;      // contador

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        i = 0;
    }

    // 1. Adicionar um novo livro.
    public void adicionarLivro(Livro l){
        if (i< livros.length){
            livros[i] = l;
            i ++;
        } else {
            System.out.println("Capacidade máxima atingida");
        }
    }

    // 2. Emprestar um livro (marcando-o como indisponível).
    public void emprestarLivro (String titulo){
        for (Livro l1 : livros){
            if (l1 != null && l1.getTitulo().equals(titulo) && l1.getDisponivel()){
                l1.setDisponivel(false);
                System.out.println("Livro "+l1.getTitulo()+" emprestado com sucesso");
            } else if(l1 != null && l1.getTitulo().equals(titulo) && !l1.getDisponivel()) {
                System.out.println("Livro indisponivel");
            }
        }
    }

    // 3. Devolver um livro (marcando-o como disponível).
    public void devolverLivro (String titulo){
        for (Livro l1 : livros){
            if (l1 != null && l1.getTitulo().equals(titulo) && !l1.getDisponivel()){
                l1.setDisponivel(true);
                System.out.println("Livro "+l1.getTitulo()+" devolvido com sucesso");
            } else if(l1 != null && l1.getTitulo().equals(titulo) && l1.getDisponivel()) {
                System.out.println("Este livro já está no estoque");
            }
        }
    }

    // 4. Listar todos os livros com suas informações.
    public void listar(){
        System.out.println("\nLivros da Biblioteca:");
        for (Livro livro: livros){
            System.out.println(livro);
        }
        System.out.println("Capacidade da biblioteca: "+i);
    }

    // 5. Listar apenas os livros disponíveis.
    public void listarDisponiveis(){
        System.out.println("Livros disponíveis:");
        for (Livro livro: livros){
            if(livro.getDisponivel()){
                System.out.println(livro);
            }
        }
    }


    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(2);

        biblioteca.adicionarLivro(new Livro("Harry Potter", "J. K. Rowling", false));
        biblioteca.adicionarLivro(new Livro("O Alienista", "Machado de Assis", true));

        biblioteca.listar();
        biblioteca.emprestarLivro("O Alienista");
        biblioteca.devolverLivro("Harry Potter");
        biblioteca.devolverLivro("O Alienista");
        biblioteca.listarDisponiveis();
        biblioteca.listar();

    }


}
