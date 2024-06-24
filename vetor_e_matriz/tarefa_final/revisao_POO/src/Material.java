public abstract class Material{
    // atributos
    private int id;
    private String titulo;
    private boolean disponivel;
    public static int totalMateriais=0;

    // construtor
    public Material(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponivel = true;
        totalMateriais++;
    }

    // getters e setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public boolean isDisponivel() {return disponivel;}
    public void setDisponivel(boolean disponivel) {this.disponivel = disponivel;}

    public static int getTotalMateriais() {return totalMateriais;}
    public static void setTotalMateriais(int totalMateriais) {Material.totalMateriais = totalMateriais;}

    // toString
    @Override
    public String toString() {
        return "id: " + id + ", titulo: " + titulo + ", disponivel: " + disponivel;
    }

}