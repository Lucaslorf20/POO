package ddd;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Exibir o seguinte seletor de opções e em função de uma escolha, solicitar os dados necessários para o cálculo da respectiva área.
		 Enviar mensagem de erro se o usuário escolher uma opção inexistente.
		 Encerrar o programa somente quando selecionada a opção de finalização. (Fazer esse exercício utilizando If..Else e/ou Case)
		1 – Triângulo
		2 – Quadrado
		3 – Retângulo
		4 – Círculo
		5 – Fim de processo
		 */
		
		double a, b, r;
		int op;
		do 
		{
			System.out.print("1–Triângulo\n2–Quadrado\n3–Retângulo\n4–Círculo\n5–Fim de processo\n");
			System.out.print("Digite uma opção:");
			op = ler.nextInt();
			if(op == 1)
			{
				System.out.print("Digite o valor da base do triângulo: ");
				b = ler.nextDouble();
				System.out.print("Digite o valor da altura do triângulo: ");
				a = ler.nextDouble();
				r = (b*a)/2;
				System.out.printf("O valor da área do triângulo é de: %.2f\n",r);
			}
			else if(op == 2)
			{
				System.out.print("Digite o valor da aresta: ");
				a = ler.nextDouble();
				r = a*a;
				System.out.printf("O valor da área do quadrado é: %.2f\n", r);
			}
			else if(op == 3)
			{
				System.out.print("Digite o valor da base: ");
				b = ler.nextDouble();
				System.out.print("Digite o valor da altura: ");
				a = ler.nextDouble();
				r = a*b;
				System.out.printf("O valor da área do retângulo é de: %.2f\n", r);
			}
			else if(op == 4)
			{
				System.out.print("Digite o valor do raio do circulo: ");
				a = ler.nextDouble();
				r= Math.PI * (a*a);
				System.out.printf("O valor da área do circulo é de: %.2f\n", r);
			}
			else if(op == 5)
				System.out.print("Programa encerrando!!");
			else
				System.out.print("Opção inválida!!\nTente novamente!!\n");
		} while (op != 5);
	}
}
