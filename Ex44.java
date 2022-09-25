package ddd;
import java.util.Scanner;

public class Ex44 {
	public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        /*Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. Após a digitação, exibir:
		a) O maior valor;
		b) A soma dos valores;
		c) A média aritmética dos valores;*/
        
        int[] a = new int[10];
        int i, aux = 0, aux2 = 0, aux3 = 0;
        
        for(i=0;i<10;i++)
        {
        	do 
        	{
            	System.out.print("Digite um valor positivo: ");
            	a [i] = ler.nextInt();
            	if(a[i] < 0)
            		System.out.println("Número inválido!!");
			} while (a[i] < 0);
        	if(a[i] > aux)
        	{
        		aux = a[i];
        	}
        	aux2 += a[i];
        }
        
        System.out.printf("O maior valor é: %d\n", aux);
        System.out.printf("O valor da soma é: %d\n", aux2);
        aux3 = aux2/10;
        System.out.printf("O valor da média aritmética é: %d", aux3);
        
	}
}
