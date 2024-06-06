//  EXERCICIO 07 - Exercício Prático

public class TesteFuncionario {
    public static void main (String[] args){
        //Criando Objetos
        FuncionarioRegular r1 = new FuncionarioRegular("Luiz", 15, 120);
        FuncionarioRegular r2 = new FuncionarioRegular("Carla", 25, 200);
        FuncionarioTerceirizado t1 = new FuncionarioTerceirizado("Thais", 10, 100,1000);
        FuncionarioTerceirizado t2 = new FuncionarioTerceirizado("Matheus", 35, 30,2000);
        //Métodos
        r1.calcularSalarioMensal();
        r2.calcularSalarioMensal();
        t1.calcularSalarioMensal();
        t2.calcularSalarioMensal();
        //Imprimindo Informações
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(t1);
        System.out.println(t2);
    }
}





