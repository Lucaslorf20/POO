package entrada_saida;
import java.util.Iterator;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double[] valores = new double[4];
		double soma = 0;
		
		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Digite o %dº valor: ", i + 1);
			valores[i] = ler.nextDouble();
			soma += valores[i];
		}
		
		double media = soma / valores.length;
		
		System.out.print("A média é " + media);
	}
}
