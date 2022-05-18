package oop.lab.w2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BasicCalculator calculator = new BasicCalculator();

        System.out.println("Ingresar la marca");
        calculator.setBrand(scanner.nextLine());

        System.out.println("Ingresar el modelo");
        calculator.setModelo(scanner.nextLine());

        System.out.println("Marca: " + calculator.getBrand());
        System.out.println("Modelo: " + calculator.getModelo());

        System.out.println("Suma: " + calculator.sum(6.5, 9));
        System.out.println("Resta: " + calculator.sub(12.5, 3.5));
        System.out.println("Multiplicacion: " + calculator.mult(9, 9));
        System.out.println("Division: " + calculator.div(39, 5));

        scanner.close();
    }

}
