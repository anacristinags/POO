//  EXERCICIO - 01 --- AULA 02

public class TesteAluno {
    public static void main(String[] args) {
        //instânciando objs
        Disciplina d1 = new Disciplina("Matemática", 60);
        Disciplina d2 = new Disciplina("Geografia", 40);
        Aluno a1 = new Aluno("Davi", 151065, 4.5, 8.9, 7.5,
                10, 7, d1);
        Aluno a2 = new Aluno("Gabriela",151071, 9,7.3,2,
                5, 4, d2);

        //chamando métodos
        a1.CalcularMedia();
        a1.SituacaoAluno();
        a1.ImprimirAssociacao();
        a2.CalcularMedia();
        a2.SituacaoAluno();
        a2.ImprimirAssociacao();
    }
}
