package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    int a = 1;
    int b = 2;

    calculadora.alteraDoisNumeros(a, b);
    System.out.println("dentro CalculadoraTest04");

    System.out.println("NUM1: " +a);
    System.out.println("NUM2: " +b);


    }
}
