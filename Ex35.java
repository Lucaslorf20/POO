package ddd;
import java.util.Scanner;
public class Ex35 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

	/*Entrar via teclado com um valor qualquer.Travar a digitação, no sentido de aceitar somente valores positivos. 
	 Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.*/

		double a,t;
		int i;
		
		do {
			System.out.print("Digite um valor positivo: ");
			a = ler.nextDouble();
		} while (a<0);
		for(i=1;i<=10;i++)
		{
			t = i*a;
			System.out.print(t);
			System.out.print("\n");
		}
	}
}
