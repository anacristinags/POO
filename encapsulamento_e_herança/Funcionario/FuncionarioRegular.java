//  EXERCICIO 07 - Exercício Prático

public class FuncionarioRegular extends Funcionario{
    //atributo
    public double salario;
    //Construtor
    public FuncionarioRegular (String nome, double salarioPorHora, int horasTrabalhadasPorMes){
        super(nome, salarioPorHora, horasTrabalhadasPorMes);
    }
    //Método que calcula o salario mensal e imprime também
    public void calcularSalarioMensal (){
        salario = getSalarioPorHora() * getHorasTrabalhadasPorMes();
        System.out.println("\nFUNCIONARIO REGULAR\n" + 
                "O salário mensal de "+getNome()+" é de "+salario+" reais");
    }
    //toString
    public String toString(){
        return "\nFuncionario(a): "+getNome()+" recebeu um salário de "+salario+"
        reais"+"\nHoras trabalhadas: "+getHorasTrabalhadasPorMes()+", salário do hora:"+getSalarioPorHora();
    }
}



