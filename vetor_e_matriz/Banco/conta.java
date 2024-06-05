// EXERCICIO 16 - AULA 10

public class Conta {
    int numero;
    String titular;
    double saldo;

    // construtor
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // getters e setters
    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    public String getTitular() {return titular;}
    public void setTitular(String titular) {this.titular = titular;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    // toString
    @Override
    public String toString() {
        return "\nNumero: " + numero + ", titular: " + titular + ", saldo: " + saldo;
    }

    // metodo para depositar valores na conta
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Valor depositado: "+valor);
        }
    }

    // metodo para sacar valores na conta
    public void sacar(double valor){
        if (valor < saldo){
            this.saldo -= valor;
            System.out.println("Valor sacado: "+valor);
        }
    }

    // metodo para transferir dinheiro entre contas (quem transfere)
    public void transferir (double valor){
        if (valor < saldo && valor > 0){
            this.saldo -= valor;
        }
    }

    // metodo para transferir dinheiro entre contas (quem recebe)
    public void receberTransferencia (double valor){
        this.saldo += valor;
    }


}
