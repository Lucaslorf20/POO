package ddd;
import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		/*Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. 
		 Solicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado, sendo que o segundo valor (B), deverá ser 
		 maior que o primeiro (A), caso contrário, digitar novamente somente o segundo. Após a validação dos dados, exibir a tabuada do valor digitado, 
		 no intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A.*/
		
		double a;
		int i, b;
		do {
			System.out.print("Digite um valor positivo: ");
			a = ler.nextDouble();
		} while (a<0);
		System.out.print("Digite o valor do começo do intervalo: ");
		i = ler.nextInt();
		do
		{
			System.out.print("Digite o valor do final do intervalo(ele precisa ser maior que o primeiro): ");
			b = ler.nextInt();
		}while(i>b);
		
	}
}
