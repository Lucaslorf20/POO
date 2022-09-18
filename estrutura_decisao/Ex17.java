package estrutura_decisao;
import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double altura, peso;
		char sexo;
		
		do {
			System.out.print("Digite o sexo: ");
			sexo = ler.next().charAt(0);
			
			if (Character.toLowerCase(sexo) != 'm' && Character.toLowerCase(sexo) != 'f') {
				System.out.println("Digite m para masculino e f para feminino!");
			}
		} while (Character.toLowerCase(sexo) != 'm' && Character.toLowerCase(sexo) != 'f');
		
		boolean homem = Character.toLowerCase(sexo) == 'm';
		
		System.out.print("Digite a altura: ");
		altura = ler.nextDouble();	
		
		System.out.print("Digite o peso: ");
		peso = ler.nextDouble();
		
		double imc = peso / altura * altura;
		
		if (homem) {
			if (imc < 20) {
				System.out.println("Abaixo do peso!");
			}
			else if (imc < 25) {
				System.out.println("Peso ideal.");
			}
			else {
				System.out.println("Acima do peso!");
			}
		}
		else {
			if (imc < 19) {
				System.out.println("Abaixo do peso!");
			}
			else if (imc < 24) {
				System.out.println("Peso ideal.");
			}
			else {
				System.out.println("Acima do peso!");
			}
		}
		
		ler.close();
	}
}
