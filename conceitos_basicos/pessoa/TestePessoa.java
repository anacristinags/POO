//  EXERCICIO - 03 --- AULA 01

public class TestePessoa {
    public static void main (String[] arg){
        //instânciando objs
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        //atribuindo valores
        p1.cidade = "Belo Horizonte";
        p1.idade = 22;
        p1.nome = "Pedro Henrique";
        p2.cidade = "Rio de Janeiro";
        p2.idade = 34;
        p2.nome = "Fernanda Braga";

        //chamando métodos
        p1.apresentar();
        p2.apresentar();
    }

}
