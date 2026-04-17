
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

      Scanner scan = new Scanner(System.in);
      
        System.out.println("Digite o número da conta: ");
        int numeroConta = scan.nextInt();
        System.out.println("Digite o número da agência: ");
        String agencia = scan.next();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scan.next();
        System.out.println("Digite o saldo da conta: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");  
        


    }
}
