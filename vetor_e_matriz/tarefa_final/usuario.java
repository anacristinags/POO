import java.util.ArrayList;
import java.util.List;
public class Usuario {
    int id;
    String nome;
    List<Material> emprestimosAtivos;
    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.emprestimosAtivos = new ArrayList<>();
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public List<Material> getEmprestimosAtivos() {return emprestimosAtivos;}
    public void setEmprestimosAtivos(List<Material> emprestimosAtivos)
    {this.emprestimosAtivos = emprestimosAtivos;}
    @Override
    public String toString() {
        return "Usuario:" + "id: " + id + ", nome: " + nome
                + ", emprestimosAtivos: " + emprestimosAtivos;
    }
    // emprestimo
    public void emprestarMaterial(Material material){
        if (material.isDisponivel()){
            material.setDisponivel(false);
            emprestimosAtivos.add(material);
            System.out.printf("\nEmprestimo "+material.getTitulo() +" realizado");
        } else {
            System.out.printf("\nMaterial "+ material.getTitulo()+" indisponível");
        }
    }
    // devolução
    public void devolverMaterial(Material material){
        if (emprestimosAtivos.remove(material)){
            material.setDisponivel(true);
            System.out.printf("Devolução realizada");
        } else{
            System.out.printf("Não há material para devolução");
        }
    }
}
