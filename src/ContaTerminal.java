import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Seja bem-vindo ao Banco Santander-Dio de contas!");
        System.out.println("Vamos criar uma conta para você!");
        Conta conta = new Conta();

        System.out.println("Digite seu nome: ");

        while (conta.getNomeCliente() == null) {
            conta.setNomeCliente(scanner.nextLine());
        }

        System.out.println("Digite o número da conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.println("Digite a agência: ");
        conta.setAgencia(scanner.next());

        System.out.println("Digite o saldo inicial: ");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Conta criada com sucesso!");
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque",
                conta.getNomeCliente(),
                conta.getAgencia(),
                conta.getNumero(),
                conta.getSaldo()));
        scanner.close();
    }


}


