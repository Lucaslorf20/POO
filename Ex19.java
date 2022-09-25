package ddd;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Uma escola com cursos em regime semestral, realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:
		//MEDIA = (P1 + 2.P2) / 3
		//Fazer um programa para entrar via teclado com os valores das notas (P1 e P2) e calcular a média.
		//Exibir a situação final do aluno (“Aprovado ou Reprovado”), sabendo que a média de aprovação é igual a cinco.

		double P1, P2, M;
		
		System.out.printf("Digite o valor da p1: ");
		P1 = ler.nextDouble();
		System.out.printf("Digite o valor da p2: ");
		P2 = ler.nextDouble();
		M = (P1 + 2*P2)/3;
		if (M >= 5)
			System.out.println("APROVADO!!!");
		else
			System.out.println("REPROVADO!!!");
	}
}
