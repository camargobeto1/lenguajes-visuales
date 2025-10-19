import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la base del triángulo: ");
        double base = input.nextDouble();
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = input.nextDouble();
        double area = (base * altura) / 2;
        System.out.printf("El área del triángulo es %.2f unidades cuadradas.%n", area);
    }
}
