package secuenciales;

import java.util.Scanner;

public class frm06 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double areaTotal = 2 * PI * radio * (radio + altura);

        double volumen = PI * radio * radio * altura;

        System.out.printf("El área total del cilindro es: %.2f unidades cuadradas.\n", areaTotal);
        System.out.printf("El volumen del cilindro es: %.2f unidades cúbicas.\n", volumen);

        scanner.close();
    }
}
    
