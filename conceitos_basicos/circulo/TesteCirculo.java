//  EXERCICIO - 02 --- AULA 01

public class TesteCirculo {
    public static void main (String[] arg){
        //instânciando objs
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();

        //valores dos atributos
        c1.raio = 2;
        c2.raio = 5;

        //chamando métodos
        c1.area();
        c1.perimetro();
        c2.area();
        c2.perimetro();
    }
}
