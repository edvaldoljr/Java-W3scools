package tutorialjava;

public class TipoCasting {
    public static void main(String[] args) {

        // Casting de tipos primitivos

        int a = 10;
        double b = a; 
        System.out.println(b); // 10.0

        double c = 10.5;
        int d = (int) c; 
        System.out.println(d); // d = 10
    }
}
