import java.util.Scanner;

public class contaTerminal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia; 
        String nomeCliente;
        double saldo = 200.79;

        System.out.println("Seja bem vindo ao Banco NCA! Por favor, entre com os seus dados abaixo: ");
        System.out.println("Numero da agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Numero do usuario: ");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado pela preferência. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}