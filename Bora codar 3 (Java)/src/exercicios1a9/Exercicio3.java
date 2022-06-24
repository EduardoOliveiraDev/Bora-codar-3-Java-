package exercicios1a9;

import java.util.*;

public class Exercicio3 {
    public static void main(String[] args){


        Scanner SaldoMes = new Scanner(System.in);
        int media = 0;
        int n;

        for (n = 0; n <= 12; n++){
            System.out.printf("Insera seu saldo do mes: ");
            media = SaldoMes.nextInt();
        }

        int saldo = (n + media) / 2;
        System.out.println(saldo);

        if(media > 0 && media < 500){
            System.out.println("Nenhum credito");
        }else if(media >= 501 && media <= 1000){
            System.out.println("30% do valor do saldo medio " + saldo);
        }else if(media >= 1001 && media <= 3000){
            System.out.println("40% do valor do saldo medio " + saldo);
        }else if(media >= 3001){
            System.out.println("50% do valor do saldo medio " + saldo);
        }


    }
}
