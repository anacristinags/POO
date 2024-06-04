// // EXERCICIO 15 - AULA 10

public class Livro {
    // atributos
    String titulo, autor;
    boolean disponivel;

    // construtor
    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    // getters e setters
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public boolean getDisponivel() {return disponivel;}
    public void setDisponivel(boolean disponivel) {this.disponivel = disponivel;}

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", autor: " + autor + ", disponivel: " + disponivel;
    }
}
