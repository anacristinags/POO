/*  EXERCICIO - 03 --- AULA 01
    Crie uma classe que represente uma pessoa. Essa classe deve ter atributos para o nome,
    idade e cidade de residência. Além disso, implemente um método que exiba uma mensagem
    contendo o nome, idade e cidade da pessoa. Em seguida, no programa principal, crie dois
    objetos do tipo Pessoa, atribua valores aos atributos e chame o método para cada um. */

public class Pessoa {
    // atributos
    String nome, cidade;
    int idade;

    // método
    void apresentar(){System.out.println("\nAPRESENTAR\nNome: "+nome+"\nIdade: "+idade+
            "\nCidade de residência: "+cidade);
    }
}
