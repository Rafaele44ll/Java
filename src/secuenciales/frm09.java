package secuenciales;

import java.util.Scanner;

public class frm09 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese un número entero positivo de 4 cifras: ");
    int numero = scanner.nextInt();
    
    int cifra1 = numero / 1000;         
    int cifra2 = (numero / 100) % 10;   
    int cifra3 = (numero / 10) % 10;    
    int cifra4 = numero % 10;           
    
    int suma = cifra1 + cifra2 + cifra3 + cifra4;
    
    System.out.println("La suma de las cifras es: " + suma);
    
    scanner.close();
}
}
    
