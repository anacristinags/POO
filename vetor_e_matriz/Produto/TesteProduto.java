// EXERCICIO 13 - AULA 10
public class TesteProduto {
    public static void main(String[] args) {
        //criando um vetor de obj Produto
        Produto[] produto = new Produto[10];

        // inicializando vetor
        produto[0] = new Produto("Tv", 2500.0);
        produto[1] = new Produto("Pneu", 340.0);
        produto[2] = new Produto("Copo", 12.0);
        produto[3] = new Produto("Caderno", 16.5);
        produto[4] = new Produto("Caneta", 2.2);
        produto[5] = new Produto("Carregador", 35.0);
        produto[6] = new Produto("Teclado", 150.0);
        produto[7] = new Produto("Espelho", 40.0);
        produto[8] = new Produto("Anel", 70.0);
        produto[9] = new Produto("Moletom", 150.0);

        calcular(produto);
    }

    // método que calcula e imprime a média dos preços dos produtos
    public static void calcular(Produto[] produto){
        double precoTotal=0;
        for (Produto p1 : produto){
            System.out.println(p1);
            precoTotal += p1.getPreco();
        }
        double mediaPreco = precoTotal/10;
        System.out.println("A média dos preços é: "+ mediaPreco);
    }
}
