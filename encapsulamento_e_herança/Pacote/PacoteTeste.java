// EXERCICIO - 01 --- AULA 07

public class PacoteTeste {
    public static void main(String[] args) {
        //instânciando pacotes
        PacoteSimples p1 = new PacoteSimples();
        PacoteExpresso p2 = new PacoteExpresso();

        //valor do peso
        double peso=2;

        //calculando e exibindo o valor do frete
        p1.calcularCustoEnvio(peso);
        p2.calcularCustoEnvio(peso);
        System.out.println(p1);
        System.out.println(p2);
    }
}
