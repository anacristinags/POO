/*  EXERCICIO 16 - AULA 10
    -> OBS: vou fazer em Arraylist para ter um outra alternativa
    Crie um sistema de gerenciamento de contas bancárias. Para isso, crie as classes Conta
    e Banco. A classe Conta deve ter os atributos numero, titular e saldo. A classe Banco
    deve ter um vetor de objetos Conta. Implemente métodos na classe Banco para:
    1. Adicionar uma nova conta.
    2. Depositar em uma conta.
    3. Sacar de uma conta.
    4. Transferir dinheiro entre duas contas.
    5. Listar todas as contas com suas informações. */

import java.util.ArrayList;

public class Banco {
    static ArrayList<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        // adicionando contas
        adicionar(1212, "Davi", 3000.0);
        adicionar(1010, "Ana", 7000.0);

        // listando todas as contas
        listar();

        // depositar na conta
        depositar(1212,200);

        // sacar da conta
        sacar(1010, 1000);

        // listando contas depois de depositar e sacar
        listar();

        // transferencia entre contas
        transferir(1212, 1010, 100);

        // listando as contas depois de transferir entre contas
        listar();
    }

    // 1. Adicionar uma nova conta.
    public static void adicionar(int numero, String titular, double saldo){
        Conta objConta = new Conta(numero, titular, saldo);
        contas.add(objConta);
    }

    // 2. Depositar em uma conta.
    public static void depositar(int numero, double valor){
        for(Conta c1: contas){
            if(c1.getNumero() == numero){
                c1.depositar(valor); // chamando método depositar da classe "conta"
            }
        }
    }

    // 3. Sacar de uma conta.
    public static void sacar(int numero, double valor){
        for (Conta c1 : contas){
            if (c1.getNumero() == numero){
                c1.sacar(valor);    // chamando método sacar da classe "conta"
            }
        }
    }

    // 4. Transferir dinheiro entre duas contas.
    public static void transferir (int numPaga, int numRecebe, double valor){
        for (Conta c1: contas){
            if (c1.getNumero() == numPaga){  // confere "id" da conta que vai pagar
                c1.transferir(valor);  // chamando o metodo da "Conta" (this.saldo -= valor;)
            }
            if (c1.getNumero() == numRecebe){   // confere "id" da conta que vai receber
                c1.receberTransferencia(valor); // chamando o metodo da "Conta" (this.saldo += valor;)
            }
        }
        System.out.println("Tranferencia da conta: "+numPaga
                +" para a conta: "+numRecebe+" realizada com sucesso!");
    }

    // 5. Listar todas as contas com suas informações.
    public static void listar (){
        System.out.println(contas);
    }


}

