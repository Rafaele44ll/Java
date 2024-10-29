package secuenciales;

import java.util.Scanner;

public class frm08 { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double PI = Math.PI;

        System.out.print("Ingrese el radio del cilindro: ");
        double r = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del cilindro: ");
        double h = scanner.nextDouble();

        double areaBase = PI * Math.pow(r, 2);
        
        double areaLateral = 2 * PI * r * h;

        double areaTotal = 2 * areaBase + areaLateral;

        System.out.printf("Área base: %.2f\n", areaBase);
        System.out.printf("Área lateral: %.2f\n", areaLateral);
        System.out.printf("Área total: %.2f\n", areaTotal);
        
        scanner.close();
    }
}
    

