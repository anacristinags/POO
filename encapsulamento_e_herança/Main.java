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

        Livro l1 = new Livro(1212, "Harry Potter", true, "JK");
    }

}
