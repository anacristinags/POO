/*  EXERCICIO - 01 --- AULA 03
->  O OBJETIVO: deste exercício é praticar a criação de classes em Java, implementando métodos
    GETTERS e SETTERS para acessar e modificar os atributos da classe.
->  Crie uma classe com os seguintes atributos privados: nome, idade, matricula. Para cada atributo
    implemente métodos getters para obter o valor do atributo e setters para modificar o valor do atributo.
    Implemente um construtor que receba como parâmetros todos os respectivos atributos. No main, crie uma
    instância da classe Aluno e inicialize-a com valores de sua escolha.                                    */


public class Aluno {
    // Atributos
    private String nome, matricula;
    int idade;

    // Construtor
    public Aluno (String nome, String matricula, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }
    // métodos getters
    public String getNome(){
        System.out.println("\nO nome é: "+ this.nome);
        return this.nome;
    }
    public String getMatricula(){
        System.out.println("O aluno está matriculado no: "+ this.matricula);
        return this.matricula;
    }
    public int getIdade(){
        System.out.println("A idade é: "+ this.idade);
        return this.idade;
    }
    // métodos setters
    public void setNome(String n){
        this.nome=n;
    }
    public void setMatricula(String m){
        this.matricula=m;
    }
    public void setIdade(int i){
        this.idade=i;
    }

}
