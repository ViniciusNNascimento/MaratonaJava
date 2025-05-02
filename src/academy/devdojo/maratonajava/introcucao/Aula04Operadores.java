package academy.devdojo.maratonajava.introcucao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;

        System.out.println("A soma é: " +resultado);

        int rest0 = 20 % 3;
        System.out.println(rest0);


        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezDiferenteQueVinte);

        int idade = 35;
        float salario = 5400f;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 4500;
        System.out.println(isDentroDaLei);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double contaCorrente = 2500;
        double contaPoupanca = 200000;
        float PlaystationValor = 5000f;
        boolean isPlaystationCincoCompravel = contaPoupanca > PlaystationValor || contaPoupanca > PlaystationValor;
        System.out.println(isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1900;
        bonus = 2000;
        bonus += 1000;
        System.out.println(bonus);

        int contador = 1;
        contador += 2;
        contador++; // apenas de 1 em 1
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;

        System.out.println(++contador2);


//        if (bonus % 2 == 0) {
//            System.out.print(String.format("o numero %.2f é par ", bonus));
//        }



//        if (20 != 20) {
//            System.out.println("ok");
//        } else {
//            System.out.println("no ok");
//        }


    }
}
