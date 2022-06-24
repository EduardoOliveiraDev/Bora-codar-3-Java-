package exercicios1a9;

import java.util.*;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner Number = new Scanner(System.in);
        int Valor1, Valor2, Valor3;

        System.out.println("Digite o primeiro valor: ");
        Valor1 = Number.nextInt();

        System.out.println("Digite o segundo valor: ");
        Valor2 = Number.nextInt();

        System.out.println("Digite o Terceiro valor: ");
        Valor3 = Number.nextInt();

        if (Valor1 > Valor2){
            if(Valor2 > Valor3){
                System.out.println(Valor1 + "\n" + Valor2 + "\n" + Valor3);
            }else{
                if (Valor1 > Valor3){
                    System.out.println(Valor1 + "\n" + Valor3 + "\n" + Valor2);
                }else{
                    System.out.println(Valor3 + "\n" + Valor1 + "\n" + Valor2);
                }
            }
        }

        if(Valor2 > Valor3) {
            if (Valor1 > Valor3) {
                System.out.println(Valor2 + Valor1 + Valor3);
            } else {
                System.out.println(Valor2 + Valor3 + Valor1);
            }
        } else {
            System.out.println(Valor3 + Valor2 + Valor1);
        }
    }
}