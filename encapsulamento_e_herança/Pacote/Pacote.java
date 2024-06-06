/*  EXERCICIO - 01 --- AULA 07
    Uma empresa de entregas precisa calcular o custo de envio de diferentes tipos de pacotes,
    incluindo pacotes simples e pacotes expressos. Cada tipo de pacote temuma regra diferente
    para calcular o custo de envio. Implemente um programa em Java que demonstre o uso de
    polimorfismo por sobrescrita para calcular o custo de envio de diferentes tipos de pacotes. */

// CLASSE ABSTRATA PACOTE
public abstract class Pacote {
    double peso;
    public abstract double calcularCustoEnvio(double peso);
}

// CLASSE PARA PACOTE SIMPLES
class PacoteSimples extends Pacote{
    double peso;

    @Override
    public double calcularCustoEnvio(double peso) {
        return peso*8;
    }
    public String toString(){
        return "O valor do frete para Pacote Simples é: "+calcularCustoEnvio(peso);
    }
}

// CLASSE PARA PACOTE EXPRESSO
class PacoteExpresso extends Pacote{
    double peso;
    @Override
    public double calcularCustoEnvio(double peso) {
        return peso*12;
    }
    public String toString(){
        return "O valor do frete para Pacote Expresso é: "+calcularCustoEnvio(peso);
    }
}
