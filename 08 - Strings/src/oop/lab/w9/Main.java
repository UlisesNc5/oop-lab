package oop.lab.w9;

import java.util.Scanner;

interface Checker{
    boolean check();
}

interface Getter<T>{
    T get();
}

class Run<T>{
    T run(Checker checker, Getter<T> getter, String message){
        T val;
        do {
            System.out.print(message);
            val = getter.get();
        }
        while(!checker.check());
        return val;
    }
}

public class Main {
    static Scanner scanner;
    static String[] strArr;
    static char[] charArr;
    static char c;
    static Run<Integer> rInt = new Run<>();
    static Run<Character> rChr = new Run<>();

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        strArr = new String[5];
        charArr = new char[5];
        int option = 0;

        do {
            System.out.println(
                "Seleccione una opcion del menu:\n" +
                "1. Crear una sublista de strings\n" + 
                "2. Checar tipo de caracteres de una lista\n" + 
                "3. Convertir a minuscula o mayuscula\n" + 
                "4. Checar elementos de una lista de strings que comienzan con un caracter\n" + 
                "5. Checar elementos de una lista de strings que terminan con un caracter\n" + 
                "6. Terminar el programa"            
            );
            option = scanner.nextInt();
            try{
                Main.class.getMethod("opt" + option).invoke(null);
            }
            catch(Exception e){
                System.out.println("Opcion no valida");
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
            charArr[i] = scanner.next().toCharArray()[0];
        }
    }

    static int beg = 0, end = 0;
    public static void opt1(){
        fillStrArr();
        beg = rInt.run(() -> {return beg >= 0 && beg <= 3;}, () -> {return scanner.nextInt();}, "Introduzca el indice (0-4) de donde empezar");
        end = rInt.run(() -> {return end > beg && end <= 4;}, () -> {return scanner.nextInt();}, "Introduzca el indice (" + beg + "-4) de donde terminar");

        for (String str : strArr) {
            int top = end < str.length() ? end : str.length();
            for(int j = beg; j <= top ; j++)
                System.out.print(str.charAt(j));
            System.out.println();
        }
    }

    static String[] types = {"letra", "digito", "espacio", "otro"};
    static int bool(boolean b){
        return b ? 1 : 0;
    }

    public static void opt2() {
        fillCharArr();
        for(char c : charArr){
            int type = bool(Character.isLetter(c)) * 1 + bool(Character.isDigit(c)) * 2 + bool(Character.isSpaceChar(c)) * 3;
            type = type == 0 ? 3 : type - 1;
            System.out.println(c + " es un " + types[type]);
        }
    }

    public static void opt3() {
        fillCharArr();
        System.out.println("m para minuscula, M para mayuscula");
        c = rChr.run(() -> {return c == 'm' || c == 'M';}, () -> {return scanner.next().charAt(0);}, "Introduzca un caracter"); 

        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (c == 'm') ?  Character.toLowerCase(charArr[i]) : Character.toUpperCase(charArr[i]);
            System.out.print(charArr[i]);
        }
        System.out.println();
    }

    public static void opt4() {
        fillStrArr();
        c = scanner.next().charAt(0);

        for (String str : strArr)
            if (str.charAt(0) == c)
                System.out.println(str);
    }

    public static void opt5() {
        fillStrArr();
        c = scanner.next().charAt(0);

        for (String str : strArr)
            if (str.charAt(str.length()) == c)
                System.out.println(str);
    }

    public static void opt6() {
        System.out.println("Fin del programa");
    }
}