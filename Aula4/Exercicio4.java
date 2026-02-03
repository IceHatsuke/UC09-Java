package Aula4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int nota;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua nota");
        nota = in.nextInt();

        if(nota >= 6)
        {
            System.out.println("Aprovado!");
        }
        else
        {
            System.out.println("Reprovado!");
        }
    }
}
