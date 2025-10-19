import java.util.Scanner;

public class KmAMetros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la distancia en kilómetros: ");
        double km = input.nextDouble();
        double metros = km * 1000;
        System.out.printf("%.2f km equivalen a %.2f metros.%n", km, metros);
    }
}
