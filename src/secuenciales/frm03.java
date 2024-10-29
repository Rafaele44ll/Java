package secuenciales;

import java.util.Scanner; 

public class frm03 {public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            final double METROS_POR_PIE = 1 / 3.2808;  
            final double METROS_POR_MILLA = 1609;      
            final double YARDAS_POR_METRO = 1.09361;   

            System.out.print("Ingrese la longitud del primer tramo en kilómetros: ");
            double tramo1Km = scanner.nextDouble();

            System.out.print("Ingrese la longitud del segundo tramo en pies: ");
            double tramo2Pies = scanner.nextDouble();

            System.out.print("Ingrese la longitud del tercer tramo en millas: ");
            double tramo3Millas = scanner.nextDouble();

            double tramo1Metros = tramo1Km * 1000;
            double tramo2Metros = tramo2Pies * METROS_POR_PIE;
            double tramo3Metros = tramo3Millas * METROS_POR_MILLA;

            double totalMetros = tramo1Metros + tramo2Metros + tramo3Metros;

            double totalYardas = totalMetros * YARDAS_POR_METRO;

            System.out.printf("La longitud total recorrida es %.2f metros.\n", totalMetros);
            System.out.printf("La longitud total recorrida es %.2f yardas.\n", totalYardas);
        }
    }
}
    
