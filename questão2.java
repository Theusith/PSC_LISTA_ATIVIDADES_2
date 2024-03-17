/* Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina?
Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol,
logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina.
Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, e
informe qual deve ser a escolha, com base no custo.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorEtanol, valorGasolina;

        System.out.println("Digite o valor da gasolina:");
        valorGasolina = sc.nextFloat();
        System.out.println("Digite o valor do Etanol");
        valorEtanol = sc.nextFloat();

        if(valorEtanol < (0.7*valorGasolina)){
            System.out.println("Abasteça com etanol!");
        }else System.out.println("Abasteça com gasolina!"); 
        sc.close();
        
    }
    
}
