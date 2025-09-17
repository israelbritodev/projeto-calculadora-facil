package calculadorasimples;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        double[] numeros;
        do {
            System.out.println("*************************************************");
            System.out.printf("Seja Bem-Vindo a Calculadora do Brito!%n");
            System.out.println("Para prosseguir digite o número da opção desejada: ");
            System.out.println(" 1 - Somar");
            System.out.println(" 2 - Subtrair");
            System.out.println(" 3 - Dividir");
            System.out.println(" 4 - Multiplicar");
            System.out.println(" 5 - Se quiser saber o resto de uma divisão");
            System.out.println("Caso, queira sair do programa digite 0...");
            System.out.print("Digite aqui a opção: ");
            System.out.printf("%n*************************************************");
            opcao = scanner.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Até a próxima...  :) ");
                    break;
                case 1:
                    System.out.println("Você escolheu Somar!");
                    numeros = lerNumeros(scanner);
                    double soma = numeros[0] + numeros[1];
                    System.out.printf("A soma de %.2f + %.2f é igual a: %.2f%n", numeros[0], numeros[1], soma);
                    break;
                case 2:
                    System.out.println("Você escolheu Subtrair!");
                    numeros = lerNumeros(scanner);
                    double subtrair = numeros[0] - numeros[1];
                    System.out.printf("A subtração de %.2f - %.2f é igual a: %.2f%n", numeros[0],numeros[1],subtrair);
                    break;
                case 3:
                    System.out.println("Você escolheu Dividir!");
                    numeros = lerNumeros(scanner);
                    if ( numeros[1] != 0){
                        double dividir = numeros[0] / numeros[1];
                        System.out.printf("A divisão de %.2f por %.2f é igual a : %.2f%n",numeros[0],numeros[1], dividir);
                        break;
                    } else {
                        System.out.println(" É impossível dividir por zero! :( ");
                        break;
                    }
                case 4:
                    System.out.println("Você escolheu Multiplicar!");
                    numeros = lerNumeros(scanner);
                    double multiplicar = numeros[0] * numeros[1];
                    System.out.printf("A multiplicação de %.2f por %.2f é igual a: %.2f%n",numeros[0],numeros[1], multiplicar);
                    break;
                case 5:
                    System.out.println("Você escolheu saber o resto de uma divisão!");
                    numeros = lerNumeros(scanner);
                    if ( numeros[1] != 0) {
                        double resto = numeros[0] % numeros[1];
                        System.out.printf("O resto da divisão de %.2f por %.2f é igual a : %.2f%n", numeros[0], numeros[1], resto);
                        break;
                    } else {
                        System.out.println("Uma divisão por zero não existe :( ");
                    }
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 0);
        scanner.close();
    }
    public static double[] lerNumeros(Scanner scanner){
        double[] variaveis = new double[2];
        System.out.print("Digite o primeiro número para a opção escolhida: ");
        variaveis[0] = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        variaveis[1] = scanner.nextDouble();

        return variaveis;
    }
}
