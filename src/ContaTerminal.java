import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("************ CRIA��O DA CONTA CORRENTE *************/n");
		System.out.println("Por favor, digite o n�mero da agencia com o d�gito! - Ex(XXX-X)");
		String agencia = sc.next();
		System.out.println("Por favor, digite o n�mero da conta!");
		int numero = sc.nextInt();	
		sc.nextLine();
		System.out.println("Por favor, digite o nome do cliente!");
		String nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite o saldo da conta!");
		double saldo = sc.nextDouble();
		
		System.out.printf("Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua ag�ncia � " + agencia + ", conta " + numero + " e seu saldo � de R$" + saldo + " j� est� dispon�vel para saque.");
		
		sc.close();
	}

}
