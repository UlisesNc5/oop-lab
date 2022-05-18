package oop.lab.w9;

import java.util.Scanner;

abstract class Correct{
    abstract boolean correct();
    String message;
}

public class Main {
    static Scanner scanner;
    static String[] strArr;
    static char[] charArr;
    static char c;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        strArr = new String[5];
        charArr = new char[5];
        int option = 0;

        do {
            System.out.println(
                "Seleccione una opcion del menu:" +
                "1. Crear una sublista de strings" + 
                "2. Checar tipo de caracteres de una lista" + 
                "3. Convertir a minuscula o mayuscula" + 
                "4. Checar elementos de una lista de strings que comienzan con un caracter" + 
                "5. Checar elementos de una lista de strings que terminan con un caracter" + 
                "6. Terminar el programa"            
            );
            option = scanner.nextInt();
            switch(option){
                case 1:
                    opt1();
                    break;
                case 2:
                    opt2();
                    break;
                case 3:
                    opt3();
                    break;
                case 4: 
                    opt4();
                    break;
                case 5: 
                    opt5();
                    break;
                case 6:
                    System.out.println("Gracias por usar el programa");
                    break;
            }
        } while(option != 6);

        scanner.close();
    }

    public static void fillStrArr(){
        System.out.println("Introduzca 5 strings");
        for (int i = 0; i < 5; i++) {
            strArr[i] = scanner.nextLine();
        }
    }

    public static void fillCharArr(){
        System.out.println("Introduzca 5 caracteres");
        for (int i = 0; i < 5; i++) {
            strArr[i] = scanner.nextLine();
        }
    }

    public static void opt1(){
        fillStrArr();
        int beg, end;
        do {
            System.out.println("Introduzca el indice (0-4) de donde empezar");
            beg = scanner.nextInt();
        } while (beg < 0 || beg > 4);
        do {
            System.out.println("Introduzca el indice (0-4) en donde terminar");
            end = scanner.nextInt();
        } while (end < 0 || end > 4);

        for (int i = 0; i < 5; i++) {
            for(int j = beg; j <= end; j++){
                System.out.print(strArr[i].charAt(j));
            }
            System.out.println();
        }
    }

    public static void opt2() {
        fillCharArr();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                System.out.println(charArr[i] + " es una letra");
            } else if (Character.isDigit(charArr[i])) {
                System.out.println(charArr[i] + " es un numero");
            } else if (Character.isWhitespace(charArr[i])) {
                System.out.println(charArr[i] + " es un espacio");
            } else {
                System.out.println(charArr[i] + " es otro caracter");
            }
        }
    }

    public static void opt3() {
        fillCharArr();
        System.out.println("m para minuscula, M para mayuscula");
        do {
            c = scanner.next().charAt(0);
        } while (c != 'm' && c != 'M');

        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (c == 'm') ?  Character.toLowerCase(charArr[i]) : Character.toUpperCase(charArr[i]);
            System.out.print(charArr[i]);
        }
        System.out.println();
    }

    public static void opt4() {
        fillStrArr();
        c = scanner.next().charAt(0);

        for (String str : strArr) {
            if (str.charAt(0) == c) {
                System.out.println(str);
            }
        }
    }

    public static void opt5() {
        fillStrArr();
        c = scanner.next().charAt(0);

        for (String str : strArr) {
            int len = str.length();
            if (str.charAt(len) == c) {
                System.out.println(str);
            }
        }
    }
}