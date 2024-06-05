/*  Exercicio 10 - Aula 10
    Crie uma classe em Java chamada Aluno que represente um aluno com os seguintes atributos: nome e idade.
    Em seguida, crie outra classe chamada CadastroAlunos. Nesta classe, você deve:
    1. Criar um vetor de objetos Aluno com capacidade para armazenar até 5 alunos.
    2. Solicitar ao usuário que insira o nome e a idade de cada aluno.
    3. Armazenar os alunos no vetor de objetos.
    4. Exibir na tela os dados de todos os alunos cadastrados.
*/

public class Aluno{
    // atributos
    String nome;
    int idade;

    // construtor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
