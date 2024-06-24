public class Livro extends Material{
    // atributo
    private String autor;

    // construtor
    public Livro(int id, String titulo, String autor) {
        super(id, titulo);
        this.autor = autor;
    }

    // get e set
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    // toString
    @Override
    public String toString() {
        return "Livro: "+ super.toString()+" autor: " + autor;
    }
}
