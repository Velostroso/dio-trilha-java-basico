import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é  " + agencia + ", conta " + numero + ", já esta disponivel para saque.");


        scanner.close();


        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuario
        
        //obter pela scanner os valores digitados no terminal

        //exibir a mensagem conta criada
    }
}
