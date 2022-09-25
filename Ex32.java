package ddd;
import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		/* Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. 
		 *Caso contrário solicitar novamente apenas o segundo valor.*/

		double a, b;
		
		System.out.print("Digite o primeiro valor: ");
		a = ler.nextDouble();
		do
		{
			System.out.print("Digite o segundo valor, ele precisa ser maior que o primeiro: ");
			b = ler.nextDouble();
		}while(a>b);
		System.out.printf("O valor de A(%.2f) é menor que o valor de B(%.2f)",a,b);
	}
}
