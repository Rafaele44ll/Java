package secuenciales;

import java.util.Scanner;

public class frm04 { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PIES_A_METROS = 0.3048;  
        final double PULGADAS_A_METROS = 0.0254; 

        System.out.print("Ingrese su estatura en pies: ");
        int pies = scanner.nextInt();

        System.out.print("Ingrese su estatura en pulgadas: ");
        int pulgadas = scanner.nextInt();

        double estaturaEnMetros = (pies * PIES_A_METROS) + (pulgadas * PULGADAS_A_METROS);

        System.out.printf("Su estatura en metros es: %.2f m\n", estaturaEnMetros);

        scanner.close();
    }
}
    

