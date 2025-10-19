import java.util.Scanner;

public class CelsiusAFahrenheint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.2f °C equivalen a %.2f °F.%n", celsius, fahrenheit);
    }
}
