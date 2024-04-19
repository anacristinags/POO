/*  EXERCICIO - 01 --- AULA 01
    Crie uma classe ContaBancaria que represente uma conta bancária. A classe deve
    ter os seguintes atributos: numero (número da conta), titular (nome do titular),
    e saldo. A classe deve ter métodos para depositar, sacar e exibir o saldo atual. */

public class ContaBancaria {
    // atributos
    int numero;
    String titular;
    float saldo;

    // métodos
    void depositar (float add) {
        if (add > 0) {
            System.out.println("\nDEPOSITAR\nSaldo inicial: " + saldo);
            saldo += add;
            System.out.println("O valor depositado foi de: "
                    + add + ".\nO saldo atual é de: " + saldo);
        }
    }

    void sacar (float sub) {
        if (sub > 0) {
            System.out.println("\nSACAR\nSaldo inicial: " + saldo);
            saldo -= sub;
            System.out.println("O saque realizado foi no valor de: "
                    + sub + ".\nO saldo atual é de: " + saldo);
        }
    }

    void exibir(){
        System.out.println("\nEXIBIR\nNome do titular: " + titular + "\nNúmero da conta: "
                + numero + "\nSaldo atual: " + saldo);
    }
}
