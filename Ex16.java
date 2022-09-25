package estrutura_decisao;
import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double hipotenusa, catetoOposto, catetoAdjacente;
		
		System.out.print("Digite o valor da hipotenusa: ");
		hipotenusa = ler.nextDouble();
		
		System.out.print("Digite o valor do cateto oposto: ");
		catetoOposto = ler.nextDouble();
		
		System.out.print("Digite o valor do cateto adjacente: ");
		catetoAdjacente = ler.nextDouble();
		
		boolean trianguloRetangulo = Math.pow(hipotenusa, 2) == Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2);
		
		if (trianguloRetangulo) {
			System.out.println("É triângulo retângulo!");
		}
		else {
			System.out.println("Não é triângulo retângulo!");
		}
		
		ler.close();
	}
}
