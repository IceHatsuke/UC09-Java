package Aula2;

public class Metodo {

    public static void newLine(){
        System.out.println("Entrei no metodo newLine");
    }

    public static void tresLinhas(){
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args) {
        System.out.println("Primeira linha");
        tresLinhas();
        System.out.println("Segunda linha");
    }
}
