public class Material {
    int id;
    String titulo;
    boolean disponivel;
    static int contadorMateriais = 0;
    public Material (int id, String titulo, boolean disponivel){
        this.id = id;
        this.titulo = titulo;
        this.disponivel = disponivel;
        contadorMateriais++;
    }

    // listar
    public void listar(){
        System.out.println("\nId: " + id + "\nTitulo: "+"\nDisponivel: "+disponivel);
    }

    // getters e setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public boolean isDisponivel() {return disponivel;}
    public void setDisponivel(boolean disponivel) {this.disponivel = disponivel;}

    public static int getContadorMateriais() {return contadorMateriais;}
    public static void setContadorMateriais(int contadorMateriais) {Material.contadorMateriais = contadorMateriais;}

}
