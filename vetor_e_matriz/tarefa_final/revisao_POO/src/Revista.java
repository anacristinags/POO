public class Revista extends Material{
    // atributo
    private String editora;

    // construtor
    public Revista(int id, String titulo, String editora) {
        super(id, titulo);
        this.editora = editora;
    }

    // get e set
    public String getEditora() {return editora;}
    public void setEditora(String editora) {this.editora = editora;}

    // toString
    @Override
    public String toString() {
        return "Revista: " + super.toString()+ "editora: " + editora;
    }
}
