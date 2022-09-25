package ddd;
import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Criar um programa para analisar a velocidade de um automóvel. Solicitar via teclado os valores da aceleração (a em m/s2),
		//velocidade inicial (v0 em m/s) e o tempo de percurso (t em s).
		//Calcular e exibir a velocidade final do automóvel em km/h. E exibir mensagem de acordo com a tabela abaixo:
		//Fórmula para o cálculo da velocidade em m/s: V = v0 + a. t

		double a, v0, t, V;
		
		System.out.printf("Digite a aceleração em m/s: ");
		a = ler.nextDouble();
		System.out.printf("Digite o valor da velocidade inicial em ms/s: ");
		v0 = ler.nextDouble();
		System.out.printf("Digite o tempo percorrido em segundos: ");
		t = ler.nextDouble();
		V=(v0 + a*t)*3.6;
		System.out.printf("A velocidade total é: %.2f km/h \n", V);
		if( V <= 40)
			System.out.println("Veículo muito lento!");
		else if(V > 40 && V <=60)
			System.out.println("Velocidade permitida!");
		else if(V > 60 && V <= 80)
			System.out.println("Velocidade de cruzeiro!");
		else if(V > 80 && V <= 120)
			System.out.println("Velocidade rápido");
		else
			System.out.println("Velocidade muito rápido");
	}
}
