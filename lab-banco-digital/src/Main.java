
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);


        Cliente cliente = null;
        Conta cc = null;
        Conta poupanca = null;
        int opcao = -1;

        while (opcao != 0) {
          System.out.println("\n--- MENU BANCO ---");
          if(cliente == null){
         System.out.println("\n--- VOCE AINDA NAO E CLIENTE PRECISA CRIAR UMA CONTA ---");
            System.out.println("1 - Criar conta");
            System.out.println("0 - Sair");
          }  
        else {
               System.out.println("Olá, " + cliente.getNome() + "!");
                System.out.println("2 - Consultar Dados da Conta");
                System.out.println("3 - Sacar");
                System.out.println("4 - Depositar");
                System.out.println("5 - Transferir (CC para Poupança)");
          }

   System.out.print("Escolha: ");
   opcao = scanner.nextInt();
   scanner.nextLine(); 

   switch (opcao) {

case 1 ->   {
    System.out.println("Digite o nome do cliente:");
    String nome = scanner.nextLine();
    System.out.println("Digite o CPF do cliente:"); 
    String cpf = scanner.nextLine();
    
    cliente = new Cliente(nome, cpf); 
    cc = new ContaCorrente(cliente);
    poupanca = new ContaPoupanca(cliente);
    
    System.out.println("Contas criadas com sucesso!");
            }

case 2 ->   {
    System.out.println("=== Dados Conta Poupança ===");
    cc.imprimirDadosComuns();
    System.out.println("=== Dados Conta Corrente ===");
    poupanca.imprimirDadosComuns();
            }

                case 3 -> {
                    System.out.println("Digite o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > cc.saldo) {
                        System.out.println("Saldo insuficiente para saque.");
                    } else {
                        cc.sacar(valorSaque);
                    }
            }

                case 4 -> {
                    System.out.println("Digite o valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    cc.depositar(valorDeposito);
            }

                case 5 -> {
                    System.out.println("Digite o valor para transferir da CC para Poupança:");
                    double valorTransferencia = scanner.nextDouble();
                    if (valorTransferencia > cc.saldo) {
                        System.out.println("Saldo insuficiente para transferência.");
                    } else {
                        
                        cc.transferir(valorTransferencia, poupanca);
                    }
            }

                case 0 -> System.out.println("Obrigado por usar nosso banco digital. Até logo!");

                default -> System.out.println("Opção inválida. Tente novamente.");
   }

            
}
scanner.close();
}
}

       


    

