package estrutura_decisao;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		System.out.print("Digite o 1º valor: ");
		valor1 = ler.nextInt();
		
		System.out.print("Digite o 2º valor: ");
		valor2 = ler.nextInt();
		
		System.out.print("Digite o 3º valor: ");
		valor3 = ler.nextInt();
		
		if(valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor é " + valor1);
		}
		else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor é " + valor2);
		}
		else if(valor3 > valor1 && valor3 > valor1) {
			System.out.println("O maior valor é " + valor3);
		}
		else {
			System.out.println("Os valores são iguais!");
		}
		
		ler.close();
	}
}
