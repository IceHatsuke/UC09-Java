package Aula7;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = in.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
}
