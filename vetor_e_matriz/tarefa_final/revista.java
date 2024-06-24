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
        System.out.printf("Editora: "+editora);
    }
    @Override
    public String toString() {
        return super.toString() + "\nEditora: " + editora;
    }
}
