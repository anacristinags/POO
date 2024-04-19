/*  EXERCICIO - 02 --- AULA 01
    Crie uma classe Circulo que represente um círculo. A classe deve ter um atributo
    raio e métodos para calcular a área e o perímetro do círculo. Utilize a fórmula
    da área (π * raio^2) e a fórmula do perímetro (2 * π * raio). */

public class Circulo {
    //atributo
    int raio;

    //métodos
    void area (){float resul1 = (3.14f * (raio * raio));
        System.out.println("\nO Circulo de raio: " + raio+ ", possui uma área de: " + resul1);
    }
    void perimetro (){float resul2 = ((2* 3.14f) *raio);
        System.out.println("O Circulo de raio: " +raio+ ", possui um perímetro de: " + resul2);
    }
}
