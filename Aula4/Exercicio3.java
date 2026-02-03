package Aula4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        num1 = in.nextInt();
        System.out.println("Digite mais um número");
        num2 = in.nextInt();

        if(num1 > num2)
        {
            System.out.println(num1 + " É maior");
        }
        else if(num1 == num2)
        {
            System.out.println("São iguais");
        }
        else
        {
            System.out.println(num2 + " É maior");
        }
    }
}
