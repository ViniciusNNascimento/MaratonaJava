package academy.devdojo.maratonajava.introcucao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
     // imprima o dia da semana, considerando primeiro como domingo

        int dia = 3;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        // char, int, byte, shot, enum, String
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("qua");
                break;
            case 5:
                System.out.println("qui");
                break;
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("dia invalido");
                break;


        }

            char sexo = 'F';
        switch (sexo){

            case 'M':
                System.out.println("Masculino");

                System.out.println("Enter username");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("vc é lgbtqia+");
                break;

        }
    }
}
