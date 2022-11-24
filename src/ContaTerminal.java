import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("************ CRIAÇÃO DA CONTA CORRENTE *************/n");
		System.out.println("Por favor, digite o número da agencia com o dígito! - Ex(XXX-X)");
		String agencia = sc.next();
		System.out.println("Por favor, digite o número da conta!");
		int numero = sc.nextInt();	
		sc.nextLine();
		System.out.println("Por favor, digite o nome do cliente!");
		String nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite o saldo da conta!");
		double saldo = sc.nextDouble();
		
		System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$" + saldo + " já está disponível para saque.");
		
		sc.close();
	}

}
