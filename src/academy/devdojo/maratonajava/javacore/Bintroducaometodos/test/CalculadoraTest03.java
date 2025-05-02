package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros(20, 2);

        double result = calculadora.divideDoisNumeros(20, 2); // uma maneira de fazer
        System.out.println(calculadora.divideDoisNumeros(20,0)); // segunda maneira
        System.out.println(result);

        System.out.println("-------------");

        calculadora.divideDoisNumeros02(80,0);

    }

}
