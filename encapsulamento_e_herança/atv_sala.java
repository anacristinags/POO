public class Material {
    int id;
    String titulo;
    boolean disponivel;
    public Material (int id, String titulo, boolean disponivel){
        this.id = id;
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    // listar
    public void listar(){
        System.out.println("\nId: " + id + "\nTitulo: "+"\nDisponivel: "+disponivel);
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

// classe listar
public class Livro extends Material{
    String autor;
    public Livro(int id, String titulo, boolean disponivel, String autor) {
        super(id, titulo, disponivel);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public void listar(){
        super.listar();
        System.out.println("\nAutor: "+autor);
    }

    @Override
    public String toString() {
        return super.toString() + "\nAutor: " + autor;
    }
}

// classe dvd
public class DVD extends Material{
    int duracao;
    public DVD(int id, String titulo, boolean disponivel, int duracao) {
        super(id, titulo, disponivel);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public void listar(){
        super.listar();
        System.out.println("\nDuração: "+duracao);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuração: " + duracao;
    }
}

// classe revista 
public class Revista extends Material{
    String editora;
    public Revista(int id, String titulo, boolean disponivel, String editora) {
        super(id, titulo, disponivel);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public void listar(){
        super.listar();
        System.out.println("\nEditora: "+editora);
    }


    @Override
    public String toString() {
        return super.toString() + "\nEditora: " + editora;
    }
}


// classe usuario 
public class Usuario {
    int id;
    String nome;
    boolean emprestimosAtivos;

    public Usuario(int id, String nome, boolean emprestimosAtivos) {
        this.id = id;
        this.nome = nome;
        this.emprestimosAtivos = emprestimosAtivos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEmprestimosAtivos() {
        return emprestimosAtivos;
    }

    public void setEmprestimosAtivos(boolean emprestimosAtivos) {
        this.emprestimosAtivos = emprestimosAtivos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", emprestimosAtivos=" + emprestimosAtivos +
                '}';
    }
}
