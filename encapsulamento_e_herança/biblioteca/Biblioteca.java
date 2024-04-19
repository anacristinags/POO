/*  EXERCICIO - 01 --- AULA 04 -- HERANÇA
->  PROBLEMA : Um sistema para uma biblioteca que precisa gerenciar diferentes tipos de materiais,
    como livros e revistas. Cada material tem um título e um ano de publicação. Além disso, existem
    diferentes tipos de empréstimos disponíveis para esses materiais, como empréstimo de curto prazo
    e empréstimo de longo prazo, cada um com uma taxa de multa por atraso diferente.
->  Implemente um programa em Java que utilize herança para representar essas relações entre materiais
    e tipos de empréstimos, permitindo calcular a multa total por atraso para um determinado material.  */

public class Biblioteca {
    //atributos
    public String tipo, titulo;
    public int ano;

    //construtor
    public Biblioteca (String tipo, String titulo, int ano){
        this.tipo = tipo;
        this.titulo = titulo;
        this.ano = ano;
    }
}

//CLASSE PARA EMPRESTIMO - EXTENDS (HERANÇA)
class Emprestimo extends Biblioteca{
    //atributos
    public int prazo, dia;
    public float multa;

    //construtor
    public Emprestimo (String tipo, String titulo, int ano, int prazo, int dia){
        super(tipo, titulo, ano);
        this.prazo = prazo;
        this.dia = dia;
    }
    //métodos
    public void emprestimo (){
        if (prazo <= 10){multa = dia * 0.5f;
        } else multa = dia * 1.5f;
    }
    public void mensagem (){
        System.out.println("\n"+tipo +" " +titulo + " do ano de "+ ano +
                "\nCom o prazo de entrega de " + prazo + " dias\nEstá atrasado por: " + dia + " dias " +
                "\nO valor da multa é de: "+ multa + " reais");
    }
}
