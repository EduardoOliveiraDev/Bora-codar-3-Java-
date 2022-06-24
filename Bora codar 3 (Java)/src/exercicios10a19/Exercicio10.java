package exercicios10a19;

import java.util.*;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("o saldo com um reajuste de 1.5% e %.2f", saldo*1.5);
    }
}
