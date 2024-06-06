/*  EXERCICIO 06 - Exercício Prático
    Desenvolva um programa para uma loja de eletrônicos. A loja precisa de um sistema
    que gerencie seu estoque de produtos. Cada produto tem um nome, um preço unitário
    e uma quantidade disponível em estoque. Além disso, implemente os seguintes métodos
    na classe Produto: Construtor, getters e setters, um método para adicionarEstoque e
    um removerEstoque. No método main teste as funcionalidades e imprima os detalhes do
    produto*/

public class Produto {
    //Atributos
    public String nome;
    double precoUnitario;
    int quantEmEstoque;
    
    //Construtor
    public Produto (String nome, double precoUnitario, int quantEmEstoque){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantEmEstoque = quantEmEstoque;}

    // getters e setters
    public String getNome(){return this.nome;}
    public void setNome(String n){this.nome = n;}

    public double getPrecoUnitario(){return this.precoUnitario;}
    public void setPrecoUnitario(double p){this.precoUnitario = p;}

    public int getQuantEmEstoque(){return this.quantEmEstoque;}
    public void setQuantEmEstoque(int q){this.quantEmEstoque = q;}

    // métodos para add no estoque
    public void adicionarEstoque(int quantidade){
        quantEmEstoque += quantidade;
        System.out.println("Adicionado: "+ quantidade +" "+ getNome() + " no estoque!");
    }

    // métodos para remover do estoque
    public void removerEstoque(int quantidade){
        if (quantEmEstoque>=quantidade){
            quantEmEstoque -= quantidade;
            System.out.println("Removido: "+ quantidade +" "+ getNome()+ " do estoque!");
        } else
            System.out.println("Não há " + getNome()+ " o suficiente para remover do estoque!");
    }
    //toString
    public String toString(){
        return "\nProduto: " + getNome() + "\nValor: " + getPrecoUnitario() +
                "\nQuantidade em estoque: " + getQuantEmEstoque();
    }
}

