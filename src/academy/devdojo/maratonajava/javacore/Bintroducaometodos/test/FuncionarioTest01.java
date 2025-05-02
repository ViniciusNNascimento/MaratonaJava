package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario imprime = new Funcionario();

        double[] salario = {1500,3500,4000};

        funcionario.setNome("Sung");
        funcionario.setIdade(24);
        funcionario.setSalarios(new double[] {1800, 1600, 3250});
        funcionario.imprime();




    }
}
