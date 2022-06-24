package exercicios1a9;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {

	// Prato

	System.out.println("Entre com o numero do prato: ");
	Scanner Number1 = new Scanner(System.in);

	int Prato = Number1.nextInt();
	int calorias = 0;

	switch(Prato) {
	case 1:
	calorias = 180;
	System.out.println("Vegetariano: " + calorias +"cal");

	break;
	case 2:
	calorias = 230;
	System.out.println("Peixe: " + calorias +"cal");
	break;

	case 3:
	calorias = 250;
	System.out.println("Frango: " + calorias +"cal");
	break;

	case 4:
	calorias = 350;
	System.out.println("Carne: " + calorias +"cal");
	break;

	default:
	System.out.println("Numero invalido, tente novamente!");

	}

	// Sobremesa

	System.out.println("Entre com o numero da sobremesa: ");
	Scanner Number2 = new Scanner(System.in);

	int Sobremesa = Number2.nextInt();
	int calorias1 = 0;

	switch(Sobremesa) {
	case 1:
	calorias1 = 75;
	System.out.println("Abacaxi: " + calorias1 +"cal");

	break;
	case 2:
	calorias1 = 110;
	System.out.println("Sorvete diet: " + calorias1 +"cal");
	break;

	case 3:
	calorias1 = 170;
	System.out.println("Mouse diet: " + calorias1 + "cal");
	break;

	case 4:
	calorias1 = 200;
	System.out.println("Mouse chocolate: " + calorias1 +"cal");
	break;

	default:
	System.out.println("Numero invalido, tente novamente!");

	}


	// Bebida

	System.out.println("Entre com o numero da bebida: ");
	Scanner Number3 = new Scanner(System.in);

	int Bebida = Number3.nextInt();
	int calorias2 = 0;

	switch(Bebida) {
	case 1:
	calorias2 = 20;
	System.out.println("Chá: " + calorias2 +"cal");

	break;
	case 2:
	calorias2 = 70;
	System.out.println("Suco de laranja: " + calorias2 +"cal");
	break;

	case 3:
	calorias2 = 100;
	System.out.println("Suco de melao: " + calorias2 + "cal");

	break;

	case 4:
	calorias2 = 65;
	System.out.println("Refrigentante diet: " + calorias2 +"cal");
	break;


	default:
	System.out.println("Numero invalido, tente novamente!");

	}

	int soma = 0;
	soma = calorias + calorias1 + calorias2;
	System.out.println(soma + " Calorias");

	}

	

	
}

