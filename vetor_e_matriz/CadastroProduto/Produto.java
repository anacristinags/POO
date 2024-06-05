//  Exercicio 11 - Aula 10
/*  Crie uma classe em Java chamada Produto que represente um produto com os seguintes atributos: nome,
    preco e quantidade. Em seguida, crie outra classe chamada CadastroProdutos. Nesta classe, você deve:
    1. Criar um vetor de objetos Produto com capacidade para armazenar até 3 produtos.
    2. Solicitar ao usuário que insira o nome, o preço e a quantidade de cada produto.
    3. Armazenar os produtos no vetor de objetos.
    4. Exibir na tela os dados de todos os produtos cadastrados, incluindo o valor total de cada
    produto (preço * quantidade).
    5. Imprimir o produto com o maior valor total (preco * quantidade).
    6. Imprimir a média dos valores totais (preco * quantidade).
 */

public class Produto {
    // atributos
    String nome;
    double preco;
    int quantidade;

    // construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // método para imprimir valor total
    public double ValorTotal(){
        double vt = getPreco()*getQuantidade();
        return vt;
    }

}
