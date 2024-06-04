// EXERCICIO 12 - AULA 10

public class TesteAluno {
    public static void main(String[] args) {
        //criando um vetor de obj aluno
        Aluno[] vet_alunos = new Aluno[5];

        // inicializando o vetor
        vet_alunos[0] = new Aluno("Luisa", 10.0);
        vet_alunos[1] = new Aluno("Carlos", 7.5);
        vet_alunos[2] = new Aluno("Pedro", 8.0);
        vet_alunos[3] = new Aluno("Lara", 4.5);
        vet_alunos[4] = new Aluno("Thaís", 9.5);

        for (Aluno aluno : vet_alunos){
            System.out.println(aluno);
        }
    }
}
