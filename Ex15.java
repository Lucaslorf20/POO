package estrutura_decisao;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2, valor3;
		
		System.out.print("Digite o 1° valor do triângulo: ");
		valor1 = ler.nextDouble();
		
		System.out.print("Digite o 2° valor do triângulo: ");
		valor2 = ler.nextDouble();
		
		System.out.print("Digite o 3° valor do triângulo: ");
		valor3 = ler.nextDouble();
		
		if (valor1 + valor2 > valor3 && valor2 + valor3 > valor1 && valor1 + valor3 > valor2) {
			if(valor1 == valor2 && valor1 == valor3) {
				System.out.println("É um triângulo equilátero!");
			}
			else if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
				System.out.println("É um triângulo escaleno!");
			}
			else {
				System.out.println("É um triângulo isósceles!");
			}
		}
		else {
			System.out.println("Não é um triângulo!");
		}
		ler.close();
	}
}
