package dev_klaus.lista02;

import java.util.Scanner;

public class ProjetoLista02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu da Lista 2 ===");
            System.out.println("1 - Média Ponderada");
            System.out.println("2 - Juros Compostos");
            System.out.println("3 - Conversão de Moedas");
            System.out.println("4 - Área e Perímetro do Triângulo");
            System.out.println("5 - Média Harmônica");
            System.out.println("6 - Média Geométrica");
            System.out.println("7 - Raízes da Equação Quadrática");
            System.out.println("8 - Média de N Números");
            System.out.println("9 - Potência");
            System.out.println("10 - Soma dos Dígitos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Exercicio011_MediaPonderada.main(null);
                    break;
                case 2:
                    Exercicio012_JurosCompostos.main(null);
                    break;
                case 3:
                    Exercicio013_ConversaoMoedas.main(null);
                    break;
                case 4:
                    Exercicio014_AreaPerimetroTriangulo.main(null);
                    break;
                case 5:
                    Exercicio015_MediaHarmonica.main(null);
                    break;
                case 6:
                    Exercicio016_MediaGeometrica.main(null);
                    break;
                case 7:
                    Exercicio017_RaizesEquacaoQuadratica.main(null);
                    break;
                case 8:
                    Exercicio018_MediaNNumeros.main(null);
                    break;
                case 9:
                    Exercicio019_Potencia.main(null);
                    break;
                case 10:
                    Exercicio020_SomaDigitos.main(null);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
