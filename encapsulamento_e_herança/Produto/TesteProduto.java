// EXERCICIO 06 - Exercício Prático

public class TesteProduto {
  public static void main(String[] args) {
    Produto p1 = new Produto("Cabo USB C", 12.5, 30);
    Produto p2 = new Produto("Fone de Ouvido", 40, 10);
    Produto p3 = new Produto("Smart TV", 2500, 5);
    // Imprimindo detalhes dos produtos
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    // Alterando os Atributos
    p1.adicionarEstoque(20);
    p2.removerEstoque(10);
    p2.removerEstoque(6);
    p3.adicionarEstoque(5);
    // Imprimindo novos detalhes dos produtos
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
  }
}
