package Aula4;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        num = in.nextInt();

        switch (num) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça Feira");
                break;
            case 3:
                System.out.println("Quarta Feira");
                break;
            case 4:
                System.out.println("Quinta Feira");
                break;
            case 5:
                System.out.println("Sexta Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
}
