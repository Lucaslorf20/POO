package entrada_saida;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double aresta;
		
		System.out.printf("Digite o valor da aresta: ");
		aresta = ler.nextDouble();
		
		double area = aresta * aresta;
		
		System.out.printf("A área do quadrado é " + area);
	}
}
