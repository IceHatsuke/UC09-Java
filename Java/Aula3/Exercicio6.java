package Aula3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        String nome;
        Scanner in = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        nome = in.nextLine();
        System.out.println("Olá "+ nome);
    }
}
