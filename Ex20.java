package ddd;

import java.util.Scanner;


public class Ex20 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Uma escola com cursos em regime semestral realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:
		//MEDIA = (P1 + 2.P2) / 3
		//Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o programa deverá calcular e exibir quanto
		//o aluno precisa tirar na segunda nota minimamente (P2) para ser aprovado, sabendo que a média de aprovação é igual a cinco.
		
		double P1, P2;
		
		System.out.printf("Digite o valor da p1: ");
		P1 = ler.nextDouble();
		P2 = (15-P1)/2;
		System.out.printf("O aluno precisará tirar: %.2f, para ser aprovado", P2);
	}
}