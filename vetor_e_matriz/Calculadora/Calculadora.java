/*  EXERCICIO 17 - AULA 11
    Crie uma classe Calculadora com métodos estáticos para somar, subtrair,
    multiplicar e dividir dois números. Em seguida, crie um programa para testar
    esses métodos. */

public class Calculadora {

    public static void somar(double num1, double num2){
        double resultado = num1 + num2 ;
        System.out.println(resultado);
    }

    public static void subtrair(double num1, double num2){
        double resultado = num1 - num2 ;
        System.out.println(resultado);
    }

    public static void multiplicar(double num1, double num2){
        double resultado = num1 * num2 ;
        System.out.println(resultado);
    }

    public static void dividir(double num1, double num2){
        double resultado = num1 / num2 ;
        System.out.println(resultado);
    }
}
