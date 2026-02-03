package Aula4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        num = in.nextInt();

        if(num < 0)
        {
            System.out.println("É negativo");
        }
        else if(num > 0)
        {
            System.out.println("É positivo");
        }
        else
        {
            System.out.println("É zero");
        }
    }
}
