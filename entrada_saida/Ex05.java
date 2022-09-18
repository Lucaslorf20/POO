package entrada_saida;
import java.util.Scanner;

public class Ex05 {
	 public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double celsius;
		
		System.out.print("Digite a temperatura em graus celsius: ");
		celsius = ler.nextDouble();
		
		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.print(celsius + "°C equivale a " + fahrenheit + " °F");
	}
}
