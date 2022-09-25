package ddd;
import java.util.Scanner;
public class Ex37 {
	   public static void main(String[] args){
	        Scanner ler = new Scanner(System.in);

	        /* Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas, solicitar que o usuário pressione uma tecla.*/

	        for (int i = 1; i < 21; i++) {
	            System.out.println("Tabuada do " + i);
	            for (int j = 1; j < 11; j++) {
	                System.out.printf("%d x %d = %d\n", i, j, i * j);
	                
	            }
	            ler.nextLine();
	        }
	        
	        ler.close();
	    }
}
