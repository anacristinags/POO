//  Exercicio 11 - Aula 10
//  Vou fazer em arraylist para ter uma solução diferente

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produto = new ArrayList<>(); // arraylist do tipo "Produto"

        // loop para cadastro de produtos
        for (int i = 0;  i < 3; i++){
            System.out.println("Digite o nome do produto");
            String nome = scanner.nextLine();
            System.out.println("Digite o preço do produto");
            double preco = scanner.nextDouble();
            System.out.println("Digite a quantidade de produtos");
            int quantidade = scanner.nextInt();
            scanner.nextLine();
            Produto objProduto = new Produto(nome, preco, quantidade); //obj que receberá os dados fornecidos pelo usuario
            produto.add(objProduto); // add objeto "objProduto" ao arrayList
        }

        // inicializando uma variavel Valor Total como null e a média como 0
        Produto VT = null;
        double SomaValores = 0;

        // loop para percorrer o array
        for (Produto i : produto) {
            // imprimindo informações de cada produto cadastrado
            System.out.println("Nome: " + i.getNome() + ", Preço: "
                    + i.getPreco() + ", Quantidade: " + i.getQuantidade()+
                    ", Valor total: " + i.ValorTotal());

            SomaValores += i.ValorTotal(); //chama método que calcula valor total e incrementando em SomaValores

            // condicional para verificar qual o valor total
            if (VT == null || i.ValorTotal()>VT.ValorTotal()){
                VT = i; // atribuindo novo valor à variavel
            }
        }
        // imprimindo produto de maior valor
        System.out.println("\nO Produto com maior valor total é: "+ VT.getNome()+
                ", valor total de: " + VT.ValorTotal());

        // imprimindo média dos valores totais
        System.out.println("\nA média dos valores totais é: "+ (SomaValores/3));
    }
}
