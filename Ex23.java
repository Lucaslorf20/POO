package ddd;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.*/
		
		double a, b, c, s;
		System.out.print("Digite o valor de A: ");
		a = ler.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = ler.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = ler.nextDouble();
		s = a + b;
		System.out.printf("O valor da soma é: %.2f", s);
		if(s<c)
		{
			System.out.print("\nO valor da soma de A e B é menor que o valor de C");
		}
	}
}
