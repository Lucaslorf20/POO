package ddd;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
	
		/*Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.*/

		double a, r;
		
		System.out.print("Digite qualquer valor: ");
		a = ler.nextDouble();
		if(a<0)
		{
			r=a*3;
			System.out.printf("O resultado é de: %.2f", r);
		}
		else
		{
			r=a*2;
			System.out.printf("O resultado é: %.2f", r);
		}
	}
}
