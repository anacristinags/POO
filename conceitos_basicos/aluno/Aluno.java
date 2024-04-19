/*  EXERCICIO - 01 --- AULA 02
->  Parte 1: Crie uma classe com os seguintes atributos: nome, matricula, nota_mat, nota_por, nota_fis,
    nota_geo, nota_quim. Crie um construtor que recebe todos os atributos como parâmetros e inicializa
    os atributos correspondentes. Métodos: calcularMedia que retorna a média e situacaoAluno que retorna
    uma String indicando se o aluno foi aprovado (média maior ou igual a 6) ou reprovado.
->  Parte 2: Crie uma classe chamada Disciplina com os seguintes atributos: nome e cargaHoraria, O
    construtor da classe Aluno agora deve receber também um objeto da classe Disciplina.                    */

public class Aluno {
    // atributos
    String nome;    
    int matricula;
    double nota_mat, nota_port, nota_fis, nota_geo, nota_quim;
    Disciplina disciplina;

    // construtor
    public Aluno (String nome, int matricula, double nota_mat, double nota_port, double nota_fis,
                   double nota_geo, double nota_quim, Disciplina disciplina){
        this.nome = nome;
        this.matricula = matricula;
        this.nota_mat = nota_mat;
        this.nota_port = nota_port;
        this.nota_fis = nota_fis;
        this.nota_geo = nota_geo;
        this.nota_quim = nota_quim;
        this.disciplina = disciplina;
    }

    // métodos
    double CalcularMedia (){return  (nota_mat+nota_port+nota_fis+nota_geo+nota_quim)/5;}

    String SituacaoAluno(){String situacao = "Reprovado";
        if(CalcularMedia()>= 6)
            situacao = "Aprovado";
        return situacao;}

    void ImprimirAssociacao(){System.out.println("\nO aluno: "+ nome+" está " + SituacaoAluno() +
            " com a média de: " + CalcularMedia() + "\nSua disciplina favorita é: " + disciplina.nome
            + "\nA carga horária da discipliana é de: " + disciplina.cargahoraria + " horas");}
}

//CLASSE DISCIPLINA
class Disciplina {
    //atributos
    String nome;
    int cargahoraria;

    //construtor
    public Disciplina(String nome, int cargahoraria){
        this.nome = nome;
        this.cargahoraria = cargahoraria;
    }
}
