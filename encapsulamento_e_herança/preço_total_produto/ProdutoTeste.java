// EXERCICIO - 02 --- AULA 07

public class ProdutoTeste {
    public static void main (String[] args){
        //instânciando os produtos
        Produto p1 = new Produto("Garrafa Térmica");
        Produto p2 = new Produto("Agenda");

        //valores
        p1.preco = 20;
        p1.quant = 4;
        p2.preco = 12.5;
        p2.quant = 6;

        //exibindo os valores e unitários e totais
        System.out.println(p1.nome+ ": valor unitário é: "+p1.calcularPrecoTotal(p1.preco));
        System.out.println(p1.nome+ ": valor total é é: "+p1.calcularPrecoTotal(p1.preco, p1.quant));
        System.out.println(p2.nome+ ": valor unitário é: "+p1.calcularPrecoTotal(p2.preco));
        System.out.println(p2.nome+ ": valor total é é: "+p1.calcularPrecoTotal(p2.preco, p2.quant));
    }
}
