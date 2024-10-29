package secuenciales;

import java.util.Scanner;

public class frm07 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;               
        double perimetro = 2 * (base + altura);   

        System.out.printf("El área del rectángulo es: %.2f unidades cuadradas.\n", area);
        System.out.printf("El perímetro del rectángulo es: %.2f unidades.\n", perimetro);

        scanner.close();
    }
}
    

