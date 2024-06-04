/*  EXERCICIO 14 - AULA 10
*   Crie uma classe Funcionario com os atributos nome, salario e departamento. Em
    seguida, crie um vetor de objetos Funcionario para armazenar 5 funcionários.
    Implemente um método que aumenta o salário de todos os funcionários de um
    determinado departamento em 10%. */

public class Funcionario {
    // atributos
    String nome, departamento;
    double salario;

    // construtor
    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    // getters e setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getDepartamento() {return departamento;}
    public void setDepartamento(String departamento) {this.departamento = departamento;}

    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}

    // metodo que aumenta salario
    public void aumentarSalario(){
        double salarioFinal = 0;
        if (getDepartamento().equals("Gerente")){
            salarioFinal = getSalario()+(getSalario()*0.10);
            System.out.println("O salario final do Gerente é de: "+salarioFinal);
        }
    }

    @Override
    public String toString() {
        return "Nome:" + nome + ", departamento: " + departamento + ", salario: " + salario;
    }
}
