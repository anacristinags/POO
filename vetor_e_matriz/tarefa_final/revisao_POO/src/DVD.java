public class DVD extends Material{
    // atributo
    private int duracao;

    // construtor
    public DVD(int id, String titulo, int duracao) {
        super(id, titulo);
        this.duracao = duracao;
    }

    // get e set
    public int getDuracao() {return duracao;}
    public void setDuracao(int duracao) {this.duracao = duracao;}

    // toString
    @Override
    public String toString() {
        return "DVD: "+ super.toString()+ "duracao: " + duracao;
    }
}
