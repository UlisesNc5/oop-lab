package oop.lab.w6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Television[] tvs = new Television[5];
        Calculator[] calcs = new Calculator[5];
        ScientificCalculator[] sCalcs = new ScientificCalculator[5];
        Scanner scanner = new Scanner(System.in);

        String brand, model;
        for (int i = 0; i < 5; i++) {
            System.out.println("Television #" + i);
            tvs[i] = new Television();

            System.out.println("Marca: ");
            brand = scanner.next();
            tvs[i].setBrand(brand);

            System.out.println("Color: ");
            String color = scanner.next();
            tvs[i].setColor(color);

            System.out.println("Modelo: ");
            model = scanner.next();
            tvs[i].setModel(model);
        }

        for (Television tv : tvs) {
            System.out.println(tv.getBrand());
            System.out.println(tv.getColor());
            System.out.println(tv.getModel());

            tv.powerOn();

            System.out.println("Cambiar canal: ");
            int chanel = scanner.nextInt();
            tv.changeChannel(chanel);

            System.out.println("Cambiar volumen: ");
            int volume = scanner.nextInt();
            tv.changeVolume(volume);

            System.out.println("Cambiar brillo: ");
            int brightness = scanner.nextInt();
            tv.setBrightness(brightness);

            System.out.println("Entrada: ");
            String entry = scanner.next();
            tv.selectEntry(entry);

            System.out.println("Encender sonido surround? 1/0: ");
            boolean SturnOn = (scanner.nextInt() != 0);
            tv.surroundSound(SturnOn);

            System.out.println(tv.powerOff());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Calculadora #" + (i + 1));
            calcs[i] = new Calculator();

            System.out.println("Marca: ");
            brand = scanner.next();
            calcs[i].setBrand(brand);

            System.out.println("Modelo: ");
            model = scanner.next();
            calcs[i].setModel(model);
        }

        System.out.println("Ingresar 2 numeros para cada una de las siguientes operaciones");

        for (Calculator calc : calcs) {
            System.out.println(calc.getBrand());
            System.out.println(calc.getModel());

            calc.powerOn();

            double a, b;

            System.out.println("Suma: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println(calc.sum(a, b));

            System.out.println("Resta: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println(calc.sub(a, b));

            System.out.println("Multiplicacion: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println(calc.mult(a, b));

            System.out.println("Division: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println(calc.div(a, b));

            System.out.println(calc.powerOff());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Calculadora cientifica #" + i);
            sCalcs[i] = new ScientificCalculator();

            System.out.println("Marca: ");
            brand = scanner.next();
            sCalcs[i].setBrand(brand);

            System.out.println("Modelo: ");
            model = scanner.next();
            sCalcs[i].setModel(model);
        }

        System.out.println("La operacion porcentaje y raiz solo ocupa un numero");

        for (ScientificCalculator calcSc : sCalcs) {
            System.out.println(calcSc.getBrand());
            System.out.println(calcSc.getModel());

            calcSc.powerOn();

            double a, b;

            System.out.println("Suma: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println(calcSc.sum(a, b));

            System.out.println("Resta: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println(calcSc.sub(a, b));

            System.out.println("Multiplicacion: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println(calcSc.mult(a, b));

            System.out.println("Division: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println(calcSc.div(a, b));

            System.out.println("Raiz: ");
            a = scanner.nextDouble();
            System.out.println(calcSc.root(a));

            System.out.println("Division: ");
            a = scanner.nextDouble();
            System.out.println(calcSc.percentage(a));

            System.out.println(calcSc.powerOff());
        }
        scanner.close();
    }
}
