import java.util.Scanner;

public class LitrosAGalones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la cantidad en litros: ");
        double litros = input.nextDouble();
        double galones = litros * 0.264172;
        System.out.printf("%.2f litros equivalen a %.2f galones.%n", litros, galones);
    }
}
