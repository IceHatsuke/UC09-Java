package Aula3;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        num1 = in.nextInt();
        System.out.println("Digite outro número");
        num2 = in.nextInt();
        System.out.println("Seus números são: "+ num1 + num2);
    }
}
