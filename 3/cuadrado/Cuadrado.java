import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el lado del cuadrado: ");
        double lado = input.nextDouble();
        double perimetro = 4 * lado;
        double area = lado * lado;
        System.out.printf("Perímetro: %.2f unidades%n", perimetro);
        System.out.printf("Área: %.2f unidades cuadradas%n", area);
    }
}
