package ddd;
import java.util.Scanner;

public class Ex38 {
	   public static void main(String[] args){
	        Scanner ler = new Scanner(System.in);


	        /*Exibir a soma dos números inteiros positivos do intervalo de um a cem*/
	        int b=1;
	        int i;
	        for(i=1;i<=100;i++)
	        {
	        	b = i + b;
	        }
	        System.out.println("A soma é: " + b);
	   }
}
