import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner nome = new Scanner(System.in);
        String nomeClient;
        System.out.println("Por favor, digite o seu nome!");
        nomeClient = nome.nextLine();
        
        Scanner agencia = new Scanner(System.in);
        String numeroAgencia;
        System.out.println("Por favor, digite o número da Agência!");
        numeroAgencia = agencia.nextLine();
        
        
        
        Scanner numero = new Scanner(System.in);
        int numeroConta;
        System.out.println("Entre o numero da sua conta");
        numeroConta = numero.nextInt();
        

        Scanner saldo = new Scanner(System.in);
        float saldoConta;
        System.out.println("Entre o saldo da sua conta");
        saldoConta = saldo.nextFloat();
       

        System.out.println("Olá " + nomeClient +", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");

        
    }
}
