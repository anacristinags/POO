import java.util.ArrayList;

public class TesteEstudante {
    public static void main(String[] args) {
        // criando arrayList e adicionando objs nele
        ArrayList<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Ana", 10));
        estudantes.add(new Estudante("Cristina", 8));
        estudantes.add(new Estudante("João", 6));

        // chamando o método estático que calcula a média
        Estudante.calcularMedia(3);
    }
}
