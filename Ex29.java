package ddd;
import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		 /*Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem decrescente.*/
		int a, b, c;
		
		System.out.print("Digite o primeiro valor: ");
		a = ler.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = ler.nextInt();
		System.out.print("Digite o terceiro valor: ");
		c = ler.nextInt();
		System.out.print("Do maior valor para o menor valor é de: ");
		if(a>b && a>c)
		{
			System.out.print(a);
			if(b>c)
			{
				System.out.print(b);
				System.out.print(c);
			}
			else
			{
				System.out.print(c);
				System.out.print(b);
			}
		}
		else if(b>c && b>c)
		{
			System.out.print(b);
			if(a>c)
			{
				System.out.print(a);
				System.out.print(c);
			}
			else
			{
				System.out.print(c);
				System.out.print(a);
			}
		}
		else
		{
			System.out.print(c);
			if(a>b)
			{
				System.out.print(a);
				System.out.print(b);
			}
			else
			{
				System.out.print(b);
				System.out.print(a);
			}
		}
	}
}
