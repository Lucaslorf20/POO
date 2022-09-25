package ddd;
import java.io.IOException;
import java.util.Scanner;
public class Ex33 {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		/*Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas.*/
		
		char s;
		
		do 
		{
			System.out.print("Digite o seu sexo(F/M): ");
		    s = (char)System.in.read();
		    System.out.print(s);
		    if(s == 'F')
		    	break;
		    else if(s == 'M')
		    	break;
		    else
		    	System.out.print("Gênero inválido!!");
		} while (s != 'F' || s != 'M');
	}
}
