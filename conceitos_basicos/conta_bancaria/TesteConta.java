//  EXERCICIO - 01 --- AULA 01

public class TesteConta {
    public static void main (String[] arg){
        //instânciando objs
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        //valores dos atributos
        c1.numero = 9876;
        c1.titular = "Luiz Carlos";
        c1.saldo = 100f;
        c2.numero = 1234;
        c2.titular = "Thais Rodrigues";
        c2.saldo = 500f;

        //chamando os métodos
        c1.depositar(900f);
        c1.sacar(500f);
        c1.exibir();
        c2.sacar(250f);
        c2.depositar(750);
        c2.exibir();
    }
}
