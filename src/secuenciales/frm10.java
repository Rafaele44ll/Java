package secuenciales;

import java.util.Scanner;

public class frm10 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese un número natural de 4 cifras: ");
        int numero = scanner.nextInt();
        
        int cifra1 = numero / 1000;        
        int cifra2 = (numero / 100) % 10;   
        int cifra3 = (numero / 10) % 10;    
        int cifra4 = numero % 10;           
        
        int numeroInvertido = (cifra4 * 1000) + (cifra3 * 100) + (cifra2 * 10) + cifra1;
        
        System.out.println("El número al revés es: " + numeroInvertido);
        
        scanner.close();
    }
}
    
