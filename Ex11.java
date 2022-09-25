package estrutura_decisao;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura;
		
		System.out.print("Digite o valor da base: ");
		base = ler.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		altura = ler.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A área é " + area);
		
		if (area  > 100) {
			System.out.println("Terreno grande!");
		}
		
		ler.close();
	}
}
