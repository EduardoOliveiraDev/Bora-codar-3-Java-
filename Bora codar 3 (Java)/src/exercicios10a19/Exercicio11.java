package exercicios10a19;

import java.util.*;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        Double salario = sc.nextDouble();
        Double vendas = sc.nextDouble();

        Double salarioFinal = ((vendas * 15) / 100);


        System.out.println("Nome: " + nome);
        System.out.printf("Salario Fixo: %.2f \n", salario);
        System.out.printf("Salario Final: %.2f \n", salarioFinal + salario);

    }
}