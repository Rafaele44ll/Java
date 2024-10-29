package secuenciales;

import java.util.Scanner;

public class frm05 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la capacidad del disco duro en gigabytes: ");
        double capacidadGB = scanner.nextDouble();

        double capacidadMB = capacidadGB * 1024; 
        double capacidadKB = capacidadMB * 1024; 
        double capacidadBytes = capacidadKB * 1024; 

        System.out.printf("La capacidad del disco duro es:\n");
        System.out.printf("- %.2f megabytes (MB)\n", capacidadMB);
        System.out.printf("- %.2f kilobytes (KB)\n", capacidadKB);
        System.out.printf("- %.2f bytes\n", capacidadBytes);

        scanner.close();
    }
}
    

