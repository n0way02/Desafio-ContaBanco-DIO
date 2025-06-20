package models;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        var numero = 1021;
        var agencia = "067-8";
        var nomeCliente = "MARIO ANDRADE";
        var saldo = 237.48;
        int numeroConta = 0;

        while(numeroConta != numero){
        System.out.println("Digite o numero da conta:");
        numeroConta = read.nextInt();
        if (numeroConta == numero) {
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque");
        }else {
            System.out.println("Conta inexistente, tente novamente.");
        }}

    }
}
