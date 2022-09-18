package entrada_saida;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double[] valoresProdutos = new double[5];
		double soma = 0;
		
		for (int i = 0; i < valoresProdutos.length; i++) {
			System.out.printf("Digite o valor referente ao %dº produto: ", i + 1);
			valoresProdutos[i] = ler.nextDouble();
			
			soma += valoresProdutos[i];
		}
		double pagamento;
		do {
			System.out.printf("A soma total dos produtos equivale a %.2f. Digite o valor do pagamento: ", soma);
			pagamento = ler.nextDouble();
			if(pagamento < soma) {
				System.out.println("Valor de pagamento abaixo!");
			}
		} while (pagamento  < soma);
		
		double troco = pagamento - soma;
		System.out.printf("O valor do troco é R$ %.2f", troco);
	}
}
