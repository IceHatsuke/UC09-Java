package Aula5;

public class Dist {
    // distancia dada por: dist = {(x2 - x1)^2 + (y2 - y1)^2}^1/2
    public static void calcularDistancia(double w1, double t1, double w2, double t2){
        System.out.println(t1);
        System.out.println(t2);
    } 

    public static void main(String[] args) {
        double dist,dx,dy,distX,distY,resultado;
        double x1,x2,y1,y2;
        x1 = 5;
        y1 = 0;
        x2 = 0;
        y2 = 1;
        dx = x2 - x1;
        dy = y2 - y2;
        distX = dx + dx;
        distY = dy + dy;
        System.out.println("Distancia do eixo x: " + distX);
        System.out.println("Distancia do eixo y: " + distY);
        calcularDistancia(x1,x2,y1,y2);
        resultado = Math.sqrt((distX + distY));
        System.out.println(resultado);

    }
}
