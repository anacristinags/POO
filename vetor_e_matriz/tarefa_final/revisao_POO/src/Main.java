public class Main {
    public static void main(String[] args) {
        // criando objs
        Livro l1 = new Livro(1212, "Harry Potter",  "JK");
        Revista r1 = new Revista(2121, "G1 News",  "Globo");
        DVD dvd1 = new DVD(1010, "Titanic", 200);
        Usuario u1 = new Usuario(5050, "Ana");
        Usuario u2 = new Usuario(5040, "Luiza");

        System.out.println("Materiais Cadastrados");
        System.out.println(l1);
        System.out.println(r1);
        System.out.println(dvd1);

        // emprestando materiais
        u1.emprestarMaterial(l1);
        u2.emprestarMaterial(l1);
        u2.emprestarMaterial(r1);

        // listando usuarios e emprestimos
        System.out.println(u1);
        System.out.println(u2);

        // listando materiais
        System.out.println("Materiais Cadastrados");
        System.out.println(l1);
        System.out.println(r1);
        System.out.println(dvd1);

        // devolvendo materiais
        u1.devolverMaterial(l1);
        u2.devolverMaterial(r1);
        u2.devolverMaterial(dvd1);

        // listando usuarios e emprestimos
        System.out.println(u1);
        System.out.println(u2);

        // listando materiais
        System.out.println("Materiais Cadastrados");
        System.out.println(l1);
        System.out.println(r1);
        System.out.println(dvd1);
    }
}
