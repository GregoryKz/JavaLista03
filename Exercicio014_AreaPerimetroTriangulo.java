package dev_klaus.lista02;

import java.util.Scanner;

public class Exercicio014_AreaPerimetroTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Área e Perímetro de um Triângulo");

        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = base + lado2 + lado3;

        System.out.printf("Área do triângulo: %.2f%n", area);
        System.out.printf("Perímetro do triângulo: %.2f%n", perimetro);

        scanner.close();
    }
}
