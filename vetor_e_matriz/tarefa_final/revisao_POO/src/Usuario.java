import java.util.ArrayList;

public class Usuario {
    // atributos
    private int id;
    private String nome;
    private int emprestimosAtivos;

    // construtor
    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.emprestimosAtivos = 0;
    }

    // getters e setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getEmprestimosAtivos() {return emprestimosAtivos;}
    public void setEmprestimosAtivos(int emprestimosAtivos) {
        this.emprestimosAtivos = emprestimosAtivos;
    }

    // toString
    @Override
    public String toString() {
        return "Usuario: " +
                "id: " + id +
                ", nome: " + nome +
                ", emprestimosAtivos: " + emprestimosAtivos;
    }

    // metodo para emprestar
    public void emprestarMaterial(Material material){
        if (material.isDisponivel()){
            material.setDisponivel(false);
            this.emprestimosAtivos++;
            System.out.println("Material: "+material.getTitulo()+" emprestado com sucesso");
        } else{
            System.out.println("Material: "+ material.getTitulo()+ "indisponivel para emprestimo");
        }
    }

    // metodo para devolver
    public void devolverMaterial(Material material){
        if (!material.isDisponivel()){
            material.setDisponivel(true);
            this.emprestimosAtivos--;
            System.out.println("Material: "+material.getTitulo()+" devolvido com sucesso");
        } else{
            System.out.println("Material: "+ material.getTitulo()+ " já estava disponivel para emprestimo");
        }
    }


}
