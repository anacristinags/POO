// Exercicio 10 - Aula 10

import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        // vetor de obj
        Aluno aluno[] = new Aluno[5];
        Scanner scanner = new Scanner(System.in);

        // laço para cadastrar alunos
        for (int i =0; i < aluno.length; i++){
            System.out.println("Digite o nome do aluno "+(i+1));
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do aluno "+(i+1));
            int idade = scanner.nextInt();
            scanner.nextLine();
            aluno[i] = new Aluno(nome, idade); // add novo obj no vetor do tipo "Aluno"
        }

        // laço para imprimir informações dos alunos
        for (int i = 0; i < aluno.length; i++){
            System.out.println("\nAluno "+ (i+1)+
                    "\nNome: "+ aluno[i].getNome()+"\nIdade: "+ aluno[i].getIdade());
        }
    }
}
