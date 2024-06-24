import java.util.ArrayList;
import java.util.List;
public class Main {
    List<Material> materiais;
    List<Usuario> usuarios;
    public Main() {
        materiais = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    // metodos sobrecarregados
    public void cadastrarMaterial(Livro livro) {materiais.add(livro);}
    public void cadastrarMaterial(Revista revista) {materiais.add(revista);}
    public void cadastrarMaterial(DVD dvd) {materiais.add(dvd);}
    // cadastro de usuario
    public void cadastrarUsuario(Usuario usuario) {usuarios.add(usuario);}
    public static void main(String[] args) {
        Main main = new Main();
        // cadastrando materiais e usuario
        Livro l1 = new Livro(1212, "Harry Potter", true, "JK");
        Revista r1 = new Revista(2121, "G1 News", true, "Globo");
        DVD dvd1 = new DVD(1010, "Titanic", false, 200);
        Usuario u1 = new Usuario(5050, "Ana");
        // usando o metodo cadastrar
        main.cadastrarMaterial(l1);
        main.cadastrarMaterial(r1);
        main.cadastrarMaterial(dvd1);
        main.cadastrarUsuario(u1);
        // emprestanto materiais
        u1.emprestarMaterial(l1);
        u1.emprestarMaterial(dvd1);
        // listando materiais
        l1.listar();
        r1.listar();
        dvd1.listar();
        // devolvendo materiais
        u1.devolverMaterial(dvd1);
        // listando informações materiais apos a devolução
        l1.listar();
        r1.listar();
        dvd1.listar();
        // printando informações do usuario e emprestimos ativos
        System.out.println(u1);
    }
}
