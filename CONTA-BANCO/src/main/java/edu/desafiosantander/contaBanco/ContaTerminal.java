package edu.desafiosantander.contaBanco;

import java.util.Scanner;

/*
 *
 * @author bruno
 */
public class ContaTerminal {

    public static void main(String[] args) throws Exception{

        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para os nossos usuários

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada.

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenomeCliente = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numeroContaCliente = scanner.nextInt(); scanner.nextLine();

        System.out.println("Digite a sua agência: ");
        String agenciaContaCliente = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        Double saldoContaCliente = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaContaCliente + ", e seu saldo de " + saldoContaCliente + " já está disponível para saque; ");
        
    }
}
