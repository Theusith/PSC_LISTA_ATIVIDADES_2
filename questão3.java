/* Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2 .*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double c;
        System.out.println("Com base no teorema de pitagoras: \nDigite o valor de a:" );
        a = sc.nextInt();
        System.out.println("Digite o valor 'b'");
        b=  sc.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.printf("O valor de c é %.2f: ", c);

        sc.close();

    }

}
