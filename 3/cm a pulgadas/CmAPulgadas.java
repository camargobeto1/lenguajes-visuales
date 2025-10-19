import java.util.Scanner;

public class CmAPulgadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la cantidad en centímetros: ");
        double cm = input.nextDouble();
        double pulgadas = cm / 2.54;
        System.out.printf("%.2f cm equivalen a %.2f pulgadas.%n", cm, pulgadas);
    }
}
