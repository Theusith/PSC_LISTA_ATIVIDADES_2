//Crie um algoritmo que leia um valor de hora (HH:MM)
// e informe (calcule) quantos minutos se passaram desde o início do dia (00:00).//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, minutosTotais;

        System.out.println("Quantas horas são: (ex: 16)");
        horas = sc.nextInt();
        System.out.println("Digite os minutos: (ex: 58)");
        minutos = sc.nextInt();
        System.out.printf("São %d:%d", horas, minutos);
        minutosTotais = (horas*60) + minutos;

        System.out.printf("\nSe passaram %d minutos desde o inicio do dia.", minutosTotais);
    }
}
