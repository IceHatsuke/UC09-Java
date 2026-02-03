package Aula4;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int idade;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = in.nextInt();

        if(idade <= 12)
        {
            System.out.println("Criança");
        }
        else if(idade <= 17)
        {
            System.out.println("Adolescente");
        }
        else if(idade <= 59)
        {
            System.out.println("Adulto");
        }
        else if(idade >= 60)
        {
            System.out.println("Idoso");
        }
    }
}
