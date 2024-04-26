import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sistema de criação de banco");
        System.out.println("Gentileza informar o Numero da Conta");
        int numero = input.nextInt();
        input.nextLine();
        System.out.println("Gentileza informar a Agencia");
        String agencia = input.nextLine();
        System.out.println("Gentileza informar o Nome do Clinete");
        String nomeCliente = input.nextLine();
        System.out.println("Gentileza informar o Saldo");
        double saldo = input.nextDouble();
        input.nextLine();


        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
