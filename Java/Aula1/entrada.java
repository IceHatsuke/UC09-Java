package Aula1;

import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa");
        line = in.nextLine();
        System.out.println("Você disse: "+ line);
    }
}
