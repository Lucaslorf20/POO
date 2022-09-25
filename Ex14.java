package estrutura_decisao;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double altura, peso;
		
		System.out.print("Digite a altura: ");
		altura = ler.nextDouble();
		
		System.out.print("Digite o peso: ");
		peso = ler.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc < 20) {
			System.out.println("Abaixo do peso!");
		}
		else if (imc < 25) {
			System.out.println("Peso ideal!");
		}
		else {
			System.out.println("Acima do peso!");
		}
		
		ler.close();
	}
}
