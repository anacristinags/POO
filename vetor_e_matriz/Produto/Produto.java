/*  EXERCICIO 13 - AULA 10
*   Crie uma classe Produto com os atributos nome e preco. Em seguida, crie um
    vetor de objetos Produto para armazenar 10 produtos. Implemente um método
    que calcula e imprime a média dos preços dos produtos. */

public class Produto {
    // atributos
    String nome;
    double preco;

    //construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // getters e setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}

    // toString
    @Override
    public String toString() {
        return "Nome: " + nome + ", preco: " + preco;
    }
}
