package entrada_saida;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura;
		
		System.out.printf("Digite a altura do triângulo: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite a base do triângulo: ");
		base = ler.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("A área do triângulo é " + area);
	}
}
