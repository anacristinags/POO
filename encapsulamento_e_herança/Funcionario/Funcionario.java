/*  EXERCICIO 07 - Exercício Prático
    Desenvolva um programa de gerenciamento de funcionários para uma empresa. A empresa
    tem dois tipos de funcionários: os funcionários regulares (possuem nome, salário por
    hora e um número de horas trabalhadas por mês) e os terceirizados (possuem nome,
    salário por hora, número de horas trabalhadas por mês e um adicional de pagamento
    por serviço terceirizado). Implemente os seguintes métodos na classe Funcionario:
    os atributos (nome, salrio por hora e número de horas) construtor, getters e setters.
    Nas duas subclasses faça:
    • FuncionarioRegular deve adicionar um método calcularSalarioMensal()
    • FuncionarioTerceirizado deve adicionar um método chamado calcularSalarioMensal()
    considerando o adicional de pagamento por serviço terceirizado.
    No método main teste as funcionalidades e imprima os detalhes de cada funcionario.*/

public class Funcionario {
    //Atributos
    private String nome;
    private double salarioPorHora;
    private int horasTrabalhadasPorMes;
    
    // construtor
    public Funcionario (String nome, double salarioPorHora, int horasTrabalhadasPorMes){
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;}
    
    // getters e setters
    public String getNome (){return this.nome;}
    public void setNome (String n){this.nome=n;}
    
    public double getSalarioPorHora(){return this.salarioPorHora;}
    public void setSalarioPorHora (double s){this.salarioPorHora = s;}
    
    public int getHorasTrabalhadasPorMes (){return this.horasTrabalhadasPorMes;}
    public void setHorasTrabalhadasPorMes (int h){this.horasTrabalhadasPorMes=h;}
}



