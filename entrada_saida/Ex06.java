package entrada_saida;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double cotacao, dolares, reais;
		
		System.out.printf("Digite o valor da cotação: ");
		cotacao = ler.nextDouble();
		
		System.out.printf("Digite a quantidade de dólares: ");
		dolares = ler.nextDouble();
		
		reais = dolares * cotacao;
		
		System.out.printf("U$ " + dolares + " equivale a  R$ " + reais);
	}
}
