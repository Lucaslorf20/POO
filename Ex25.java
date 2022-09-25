package ddd;

import java.util.Scanner;
import java.io.IOException;

public class Ex25 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
	/* Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar. Utilize o operador %*/
		
		int a;
		System.out.print("Digite o um número: ");
		a = ler.nextInt();
		if(a%2 == 0)
			System.out.print("O valor é par");
		else
			System.out.print("O valor é ímpar");
	}
}
