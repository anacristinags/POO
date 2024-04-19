//EXERCICIO - 02 --- AULA 04 -- HERANÇA

public class TesteVeiculo {
    public static void main(String[] args) {
        // instânciando objs
        Carro c1 = new Carro("BMW", "X1", 2023, 4);
        Moto m1 = new Moto("Honda", "PCX", 2020, false);

        // imprimindo informações
        System.out.println(c1);
        System.out.println(m1);

        //mudando atributos
        c1.setAno(2024);
        c1.setPortas(2);
        m1.setModelo("EM1");
        m1.setEletrica(true);

        //imprimindo novas informações
        System.out.println(c1);
        System.out.println(m1);
    }
}
