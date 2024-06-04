// EXERCICIO 14 - AULA 10

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = new Funcionario("Luiz", "Atendente", 1800);
        funcionarios[1] = new Funcionario("Paulo", "Gerente", 6300);
        funcionarios[2] = new Funcionario("Thaís", "Vendedora", 2400);
        funcionarios[3] = new Funcionario("Pedro", "Vendedor", 2400);
        funcionarios[4] = new Funcionario("Carlos", "Fiscal", 3100);

        // for para percorrer o vetor e chamar o metodo
        for (Funcionario f : funcionarios){
            System.out.println(f);
            f.aumentarSalario();
        }

    }
}
