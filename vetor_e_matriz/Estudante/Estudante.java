/*  EXERCICIO 18 - AULA 11
    Crie uma classe Estudante com os atributos nome e nota. Adicione um método
    estático para calcular a média das notas de um array de estudantes.*/

public class Estudante {
    // atributos
    static double notafinal = 0;
    String nome;
    double nota;

    // construtor
    public Estudante(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        notafinal += nota; // incrementa as notas para cada obj Estudante que é criado
    }

    // getters e setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getNota() {return nota;}
    public void setNota(double nota) {this.nota = nota;}

    // método estático que calcula a média total
    public static void calcularMedia(int quanEstudantes){
        double media = notafinal/quanEstudantes;
        System.out.println("A média é: "+media);
    }
}
