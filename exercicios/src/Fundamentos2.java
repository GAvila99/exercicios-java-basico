package exercicios.src;

import java.util.Scanner;

public class Fundamentos2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lado do Quadrado: ");
        double lado = Double.parseDouble(input.nextLine());
        System.out.print("Altura do Quadrado: ");
        double altura = Double.parseDouble(input.nextLine());
        System.out.printf("\n fómula: %.2f X %.2f = %.2fm\u00b2", lado, altura, (lado*altura));
        input.close();


    }
}
