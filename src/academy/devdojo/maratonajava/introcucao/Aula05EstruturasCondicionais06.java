package academy.devdojo.maratonajava.introcucao;



public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e Dados os valores de 1 a 7 imprima se é dia util ou final de semana
        // considerando 1 como domingo

        int diaSemana = 1;

        switch (diaSemana) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }
    }
}
