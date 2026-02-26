package Aula7;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        int num;
        int soma = 0;
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = in.nextInt();

        while (i <= num) {
            soma += i;
            i++;
        }
        System.out.println("A soma é: " + soma);
    }
}
