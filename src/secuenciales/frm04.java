package secuenciales;

import java.util.Scanner;

public class frm04 { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Factor de conversión
        final double PIES_A_METROS = 0.3048;  // 1 pie = 0.3048 metros
        final double PULGADAS_A_METROS = 0.0254; // 1 pulgada = 0.0254 metros

        // Ingresar la estatura en pies y pulgadas
        System.out.print("Ingrese su estatura en pies: ");
        int pies = scanner.nextInt();

        System.out.print("Ingrese su estatura en pulgadas: ");
        int pulgadas = scanner.nextInt();

        // Convertir la estatura a metros
        double estaturaEnMetros = (pies * PIES_A_METROS) + (pulgadas * PULGADAS_A_METROS);

        // Mostrar el resultado
        System.out.printf("Su estatura en metros es: %.2f m\n", estaturaEnMetros);

        // Cerrar el scanner
        scanner.close();
    }
}
    

