/*  EXERCICIO 20 - AULA 11
    Crie uma classe Livro com os atributos titulo, autor e quantidadeDisponivel.
    Adicione métodos estáticos para emprestar um livro (diminuir a quantidade disponível)
    e para verificar a disponibilidade de um livro específico em um array de livros.*/

import java.util.ArrayList;

public class Livro {
    // atributos
    String titulo, autor;
    int quantidadeDisponivel;

    // construtor
    public Livro(String titulo, String autor, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    // getters e setters
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public int getQuantidadeDisponivel() {return quantidadeDisponivel;}
    public void setQuantidadeDisponivel(int quantidadeDisponivel) {this.quantidadeDisponivel = quantidadeDisponivel;}

    // método estático para emprestar livro
    public static void emprestarLivro(Livro l1){
        l1.setQuantidadeDisponivel(l1.quantidadeDisponivel-1); // diminuindo a quantidade de livros disponiveis
        System.out.println("\nO livro: "+l1.getTitulo()+", foi emprestado com sucesso!\nQuantidade restante:"
                +l1.getQuantidadeDisponivel());
    }

    // método estático para emprestar livro através do nome: (outra alternativa)
    public static void emprestarLivro(String titulo, ArrayList<Livro> livros){
        for(Livro i: livros){
            if(i.getTitulo().equalsIgnoreCase(titulo)){
                emprestarLivro(i); //chamando o método p/ diminuir quant (melhor que ter que fzr a msm lógica dnv)
                return; // saindo do método
            }
        }System.out.println("O livro " + titulo + " não foi encontrado.");
    }

    // método estático para verificar a disponibilidade do livro
    public static void verificarDisponibilidade(String titulo, ArrayList<Livro> livros){
        for(Livro i: livros){
            if(i.getQuantidadeDisponivel()>0 && i.getTitulo().equalsIgnoreCase(titulo)){ // >0 && == titulo
                System.out.println("O livro "+i.getTitulo()+" está disponível");
            } else if(i.getQuantidadeDisponivel()<=0 && i.getTitulo().equalsIgnoreCase(titulo)) { // <=0 && == titulo
                System.out.println("O livro "+i.getTitulo()+" não está disponível");
            }
        }
    }

}
