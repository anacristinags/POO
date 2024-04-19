//  EXERCICIO - 01 --- AULA 04 -- HERANÇA

public class TesteBiblioteca {
    public static void main(String[] args) {
        //instânciando objs
        Emprestimo e1 = new Emprestimo("Livro", "O Alienista", 1882, 20, 6);
        Emprestimo e2 = new Emprestimo("Revista", "Capricho", 2024, 5, 15);

        //chamando métodos
        e1.emprestimo();
        e1.mensagem();
        e2.emprestimo();
        e2.mensagem();
    }
}
