/*  EXERCICIO 19 - AULA 11
    Crie uma classe Produto com os atributos nome, preco e quantidadeEmEstoque. Adicione métodos
    estáticos para calcular o valor total em estoque de um array de produtos e para encontrar o
    produto mais caro.*/

public class Produto {
    // atributos
    String nome;
    double preco;
    int quantidadeEmEstoque;
    // atributos do tipo static
    static double valorPorProduto =0; // valor total por produto
    static double somaValores = 0;  // soma total de todos os produtos
    static int quantidadeTotalEstoque =0; // quantidade total de todos produtos 

    // construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        valorPorProduto = preco * quantidadeEmEstoque;  // valor total por produto em estoque
        somaValores += valorPorProduto;     // incrementa a soma total de todos produtos em estoque
        quantidadeTotalEstoque +=quantidadeEmEstoque; // incrementa a quantidade total de produtos
    }

    // getters e setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}

    public int getQuantidadeEmEstoque() {return quantidadeEmEstoque;}
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {this.quantidadeEmEstoque = quantidadeEmEstoque;}

    // método estático que imprime o valor total de produtos em estoque
    public static void imprimirValorTotal(){
        System.out.println("O valor total em estoque é: "+somaValores);
        System.out.println("A quantidade total de produtos em estoque é: "+quantidadeTotalEstoque);
    }

}
