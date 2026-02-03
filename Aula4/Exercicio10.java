package Aula4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double valor;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        valor = in.nextDouble();

        if(valor > 100)
        {
            valor = valor * 0.9;
        }
        System.out.println("O valor final é "+ valor);
    }
}
