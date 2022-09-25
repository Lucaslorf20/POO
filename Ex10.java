package estrutura_decisao;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.print("Digite o 1º valor: ");
		valor1 = ler.nextInt();
		
		System.out.print("Digite o 2º valor: ");
		valor2 = ler.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("O maior valor é " + valor1);
		}
		else if (valor2 > valor1) {
			System.out.println("O maior valor é " + valor2);
		}
		else {
			System.out.println("Os números são iguais!");
		}
	}
}
