public class Usuario {
    int id;
    String nome;
    boolean emprestimosAtivos;

    public Usuario(int id, String nome, boolean emprestimosAtivos) {
        this.id = id;
        this.nome = nome;
        this.emprestimosAtivos = emprestimosAtivos;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public boolean isEmprestimosAtivos() {return emprestimosAtivos;}
    public void setEmprestimosAtivos(boolean emprestimosAtivos) {this.emprestimosAtivos = emprestimosAtivos;}

    @Override
    public String toString() {
        return "Usuario:" + "id: " + id + ", nome: " + nome
                + ", emprestimosAtivos: " + emprestimosAtivos;
    }
}