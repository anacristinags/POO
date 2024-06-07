//  EXERCICIO 19 - AULA 11

import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {
        // criando arrayList e adicionando objs nele
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Tv", 2000,5));
        produtos.add(new Produto("HD", 300,10));
        produtos.add(new Produto("CD",25,4));

        // chamando o método estático que imprime valor total
        Produto.imprimirValorTotal();

        // encontrando produto mais caro
        Produto maisCaro = null; // variavel do tipo "Produto" começando como null para poder uar na condicinal inicial
        for (Produto i : produtos){
            if (maisCaro == null || i.getPreco()>maisCaro.getPreco()){ // condicional para comparar os valores
                maisCaro = i; // se passar atribui o produto de maior valor na variavel
            }
        }

        // imprimindo produto mais caro
        System.out.println("O produto mais caro é: "+ maisCaro.getNome()+", valor:"+maisCaro.getPreco());
    }
}
