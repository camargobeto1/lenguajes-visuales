import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el diámetro del círculo: ");
        double diametro = input.nextDouble();
        double radio = diametro / 2;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El área del círculo es %.2f unidades cuadradas.%n", area);
    }
}
