package ddd;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Entrar via teclado com dois valores quaisquer. Após a digitação, exibir um seletor de opções (“menu”) com as seguintes opções:
		(Fazer esse exercício utilizando If..Else e/ou Case)
		1 – Multiplicação
		2 – Adição
		3 – Divisão
		4 – Subtração
		5 – Fim de processo (sair do programa)
		Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida (letras ou números) e processar a respectiva operação. 
		Enviar mensagem de erro se a opção escolhida não existir no seletor.
		Encerrar o programa somente quando o usuário escolher a opção de finalização. 
		Repare que a opção de número três é de divisão e o programa deverá enviar mensagem de erro, (somente nesta opção) se o denominador for zero.*/

		double a, b, r;
		int op;
		do {
			System.out.print("Digite o primeiro valor: ");
			a = ler.nextDouble();
			System.out.print("Digite o segundo valor: ");
			b = ler.nextDouble();
			System.out.print("\n 1-Multiplicação\n 2-Adição\n 3-Divisão\n 4-Subtração\n 5-Fim do programa\n");
			System.out.print("Digite uma opção:");
			op = ler.nextInt();
			if(op == 1)
			{
				r = a * b;
				System.out.printf("O valor da multiplicação de %.2f por %.2f é: %.2f\n",a, b, r);
				r = b * a;
				System.out.printf("O valor da multiplicação de %.2f por %.2f é: %.2f\n",b ,a, r);
			}
			else if(op == 2)
			{
				r = a + b;
				System.out.printf("O valor da soma de %.2f por %.2f é: %.2f\n", a, b, r);
				r = b + a;
				System.out.printf("O valor da soma de %.2f por %.2f é: %.2f\n", b, a, r);
			}
			else if(op == 3)
			{
				if(b == 0)
				{
					System.out.print("ERRO!!Denominador não pode ser 0\n");
				}
				else 
				{
					r = a / b;
					System.out.printf("O valor da divisão de %.2f por %.2f é: %.2f\n", a, b, r);
				}
				if(a == 0)
				{
					System.out.print("ERRO!!Denominador não pode ser 0\n");
				}
				else
				{
					r = b / a;
					System.out.printf("O valor da divisão de %.2f por %.2f é: %.2f\n", b, a, r);
				}
			}
			else if(op == 4)
			{
				r = a - b;
				System.out.printf("O valor da subtração de %.2f por %.2f é: %.2f\n", a, b, r);
				r = b - a;
				System.out.printf("O valor da subtração de %.2f por %.2f é: %.2f\n", b, a, r);
			}
			else if(op == 5)
				System.out.print("Programa encerrando!!\n");
			else
				System.out.print("Valor inválido!!\n");
		} while (op != 5);
	}
}
