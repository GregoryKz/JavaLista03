package dev_klaus.lista02;

import java.util.Scanner;

public class Exercicio013_ConversaoMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversão de Moedas");

        System.out.print("Digite o valor em Reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.print("Digite a taxa de câmbio para Dólar (R$): ");
        double taxaDolar = scanner.nextDouble();

        System.out.print("Digite a taxa de câmbio para Euro (R$): ");
        double taxaEuro = scanner.nextDouble();

        System.out.print("Digite a taxa de câmbio para Libra (R$): ");
        double taxaLibra = scanner.nextDouble();

        double valorDolar = valorReais / taxaDolar;
        double valorEuro = valorReais / taxaEuro;
        double valorLibra = valorReais / taxaLibra;

        System.out.printf("Valor em Dólares: $ %.2f%n", valorDolar);
        System.out.printf("Valor em Euros: € %.2f%n", valorEuro);
        System.out.printf("Valor em Libras: £ %.2f%n", valorLibra);

        scanner.close();
    }
}
