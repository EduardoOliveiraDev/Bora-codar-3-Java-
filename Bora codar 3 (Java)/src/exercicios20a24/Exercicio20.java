package exercicios20a24;

import java.util.*;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] valor = new int[20];
        int valores = 0;

        for (int i = 1; i < 21; i++) {
            System.out.println(i + " valor: ");
            valor[i] = sc.nextInt();
        }
        for(Integer item: valor) {
            if(item > 8) {
                valores++;
            }
        }
        System.out.println(valores);

        sc.close();
    }

}