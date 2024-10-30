package secuenciales;

import java.util.Scanner;

public class frm11 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero de 3 cifras: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero de 3 cifras: ");
        int numero2 = scanner.nextInt();
        
        int cifra1_num1 = numero1 / 100;            
        int cifra2_num1 = (numero1 / 10) % 10;      
        int cifra3_num1 = numero1 % 10;             
        
        int cifra1_num2 = numero2 / 100;            
        int cifra2_num2 = (numero2 / 10) % 10;      
        int cifra3_num2 = numero2 % 10;             
        
        int nuevoNumero1 = (cifra3_num2 * 100) + (cifra2_num1 * 10) + cifra1_num2;
        int nuevoNumero2 = (cifra3_num1 * 100) + (cifra2_num2 * 10) + cifra1_num1;
        
        System.out.println("El primer número con cifras intercambiadas es: " + nuevoNumero1);
        System.out.println("El segundo número con cifras intercambiadas es: " + nuevoNumero2);
        
        scanner.close();
    }
}
    

