public class Livro extends Material{
    String autor;
    public Livro(int id, String titulo, boolean disponivel, String autor) {
        super(id, titulo, disponivel);
        this.autor = autor;
    }
    // getters e setters
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}
    @Override
    public void listar(){
        super.listar();
        System.out.println("Autor: "+autor);
    }
    @Override
    public String toString() {
        return super.toString() + "\nAutor: " + autor;
    }
}
