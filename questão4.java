/* Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2 .*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        double a = sc.nextDouble();

        System.out.println("Insira o valor de B:");
        double b = sc.nextDouble();

        System.out.println("Insira o valor de C:");
        double c = sc.nextDouble();

        double x = (b * c) / a;

        System.out.printf("O valor de X na regra de três é: %.2f\n", x);

        sc.close();

    }

}
