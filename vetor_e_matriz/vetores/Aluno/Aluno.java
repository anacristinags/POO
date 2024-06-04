/*  EXERCICIO 12 - AULA 10
*   Crie uma classe Aluno com os atributos nome e nota. Em seguida, crie um vetor
    de objetos Aluno para armazenar 5 alunos e imprima o nome e a nota de cada
    aluno. */

public class Aluno {
    // atributos
    String nome;
    double nota;

    //construtor
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // getters e setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getNota() {return nota;}
    public void setNota(double nota) {this.nota = nota;}

    //toString
    @Override
    public String toString() {
        return "Nome: " + nome + ", nota: " + nota;
    }
}
