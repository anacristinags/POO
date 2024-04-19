//  EXERCICIO - 01 --- AULA 03

public class TesteAluno {
    public static void main(String[] args) {
        //instânciando obj
        Aluno a1 = new Aluno("João", "1° Semestre", 20);

        //chamando métodos
        a1.getNome();
        a1.getMatricula();
        a1.getIdade();

        //modificando  atributos
        a1.setNome("Lucas");
        a1.setMatricula("2º Semestre");
        a1.setIdade(33);

        //chamando métodos
        a1.getNome();
        a1.getMatricula();
        a1.getIdade();
    }
}
