package entrada_saida;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double altura, base;
		
		System.out.printf("Digite a altura: ");
		altura = ler.nextDouble();
		
		System.out.print("Digite a base: ");
		base = ler.nextDouble();
		
		double area = base * altura;
		
		System.out.print("A base é: " + area);
	}
}
