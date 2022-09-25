package ddd;
import java.util.Scanner;




public class Ex54 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Cliente[] listaCliente = new Cliente[5];
        
        for(int i = 0; i < 5; i++)
        {
         
            String nome = new String();
            int idade;
            String email = new String();
            String agencia = new String();
            String numero = new String();
            double saldo = 0;

       System.out.printf("Digite o nome do cliente: ");
        nome = ler.next();
        
        System.out.printf("Digite a idade do cliente: ");
        idade = ler.nextInt();
        
        System.out.printf("Digite o email do cliente: ");
        email = ler.next();

        System.out.printf("Possui conta bancária Sim [1]- Não[0]: ");
        int icConta = ler.nextInt();
        if (icConta != 0)
        {
            System.out.printf("Insira a agência: ");
            agencia = ler.next();
            System.out.printf("Insira a número da conta: ");
            numero = ler.next();
            System.out.printf("Insira o saldo da conta: ");
            saldo = ler.nextDouble();
        }
        ContaBancaria contab = new ContaBancaria(agencia, numero, saldo);
       listaCliente[i] = new Cliente(i, nome, idade, email, contab);
        
        }
        
        for(int j = 0; j < 5; j++)
        {
        	System.out.println(listaCliente[j].exibirNomeIdade());
            if (!listaCliente[j].conta.agencia.equals("") && 
                !listaCliente[j].conta.numero.equals("")) {
                System.out.println(listaCliente[j].exibirDadosConta());
            }
            System.out.printf("\n");
        }
    }
}