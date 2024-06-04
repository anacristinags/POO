public class DVD extends Material{
    int duracao;
    public DVD(int id, String titulo, boolean disponivel, int duracao) {
        super(id, titulo, disponivel);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public void listar(){
        super.listar();
        System.out.println("\nDuração: "+duracao);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuração: " + duracao;
    }
}
