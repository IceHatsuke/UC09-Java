package Aula1;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        String line;
        String nome;
        String sobrenome;
        Scanner in = new Scanner(System.in); // Declaração de um Scan
        System.out.println("Qual seu nome?");
        nome = in.nextLine();
        System.out.println("Qual seu sobrenome?");
        sobrenome = in.nextLine();

        System.out.println("Bem vindo(a): "+ nome + " " + sobrenome);

    }
}
