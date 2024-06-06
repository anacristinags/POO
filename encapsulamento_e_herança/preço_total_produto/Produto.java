/*  EXERCICIO - 02 --- AULA 07
    Um sistema de controle de estoque precisa calcular o preço total de diferentes produtos,
    levando em consideração o preço unitário e a quantidade de unidades compradas. Implemente
    um programa em Java que demonstre o uso de polimorfismo por sobrecarga para calcular o
    preço total dos produtos, tanto para uma única unidade quanto para várias unidades. */

public class Produto {
    // atributos
    double preco;
    int quant;
    String nome;

    // construtor para o nome
    public Produto(String nome){this.nome = nome;}

    // sobrecarga dos métodos
    public double calcularPrecoTotal(double preco){
        return preco;
    }
    public double calcularPrecoTotal(double preco, int quant){
        return preco * quant;
    }

}

