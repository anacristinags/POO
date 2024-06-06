//  EXERCICIO 07 - Exercício Prático

public class FuncionarioTerceirizado extends Funcionario {
    //atributos
    public double pagPorServico, salario;
    //Construtor
    public FuncionarioTerceirizado (String nome, double salarioPorHora, int horasTrabalhadasPorMes, double pagPorServico){
        super(nome, salarioPorHora, horasTrabalhadasPorMes);
        this.pagPorServico = pagPorServico;
    }
    //Método que calcula salario mensal considerando o adicional de pagamento
    public void calcularSalarioMensal(){
        salario = (getSalarioPorHora() * getHorasTrabalhadasPorMes()) + pagPorServico;
        System.out.println("\nFUNCIONARIO TERCEIRIZADO\n" +
                "O salário mensal de "+getNome()+" foi de "+salario+" reais");
    }
    //toString
    public String toString(){
        return "\nFuncionario(a): "+getNome()+" recebeu um salário de "+salario+"
        reais"+"\nHoras trabalhadas: "+ getHorasTrabalhadasPorMes()+", salário do hora:
        "+getSalarioPorHora()+ ", pagamento por serviço: "+pagPorServico;
    }
}




