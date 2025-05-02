package academy.devdojo.maratonajava.introcucao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double faixa1 = 9.70 / 100;
        double faixa2 = 37.35 / 100;
        double faixa3 = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * faixa1;

        } else if (salarioAnual >= 34713 && salarioAnual <= 68532) {
            valorImposto = salarioAnual * faixa2;
        }else {
            valorImposto = salarioAnual * faixa3;
        }
        System.out.println(valorImposto);




    }
}
