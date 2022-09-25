package ddd;

import java.util.Scanner;

public class Ex27 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		/* Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.*/
		
		double a, r, b;
		
		System.out.print("Digite um valor: ");
		a = ler.nextDouble();
		b = a % 2;
		if(b==0)
		{
			r = a + 5;
			System.out.printf("O valor é igual a: %.2f",r);
		}
		else
		{
			r = a + 8;
			System.out.printf("O valor é igual a: %.2f",r);
		}
	}
}
