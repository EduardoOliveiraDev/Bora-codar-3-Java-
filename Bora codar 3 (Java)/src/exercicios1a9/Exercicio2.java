package exercicios1a9;

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int Number;

        System.out.println("Informe um numero: ");
        Number = sc.nextInt();

        if(Number % 10 == 0){
            System.out.print("Esse numero e divisivel por 10!");
        }else if(Number % 5 == 0){
            System.out.print("Esse numero e divisivel por 5!");
        }else if(Number % 2 == 0){
            System.out.print("Esse numero e divisivel por 2!");
        }else{
            System.out.print("Nao e possivel dividir!!");
        }
    }
}