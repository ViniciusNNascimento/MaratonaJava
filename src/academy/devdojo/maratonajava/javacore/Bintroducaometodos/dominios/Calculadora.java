package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios;

public class Calculadora {
    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1 + num2);

    }

    public double divideDoisNumeros(double num1, double num2){

        if (num2 != 0){
            return num1 / num2;
        }

        return 0;

    }

    public void divideDoisNumeros02(double num1, double num2) {

        if (num2 == 0){
            System.out.println("nao exite divisao por zero");
            return;  // ou posso utilizar else
        }

            System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 39;
        numero2 = 33;
        System.out.println("dentro do altera dois numeros");
        System.out.println("NUM1: " +numero1);
        System.out.println("NUM2: " +numero2);

    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;

        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;

        }
        System.out.println(soma);
    }


}
