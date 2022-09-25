package ddd;
import java.util.Scanner;

public class Ex34 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		/*Exibir a tabuada do número cinco no intervalo de um a dez.*/
		int a, i;
		for(i=1;i<=10;i++)
		{
			a = 5*i;
			System.out.print(a);
			System.out.print("\n");
		}
	}
}
