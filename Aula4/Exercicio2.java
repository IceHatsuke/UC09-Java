package Aula4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int idade;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = in.nextInt();

        if(idade >= 18)
        {
            System.out.println("Maior de idade");
        }
        else
        {
            System.out.println("Menor de idade");
        }
    }
}
