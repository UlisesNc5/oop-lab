
package oop.lab.w10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileHandler {
    private static String[] readFile(String fileName) {
        ArrayList<String> lista = new ArrayList<>();
        try {
            try (Scanner in = new Scanner(new java.io.File(fileName))) {
                String linea;
                while (in.hasNextLine()) {
                    linea = in.nextLine();
                    lista.add(linea);
                }
            }
            return lista.toArray(String[]::new);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            return null;
        }
    }

    private static void writeFile(String fileName) {
        try {
            Scanner in;
            try (java.io.FileWriter fw = new java.io.FileWriter(fileName)) {
                in = new Scanner(System.in);
                String linea;
                System.out.println("Escriba el contenido del archivo");
                do {
                    linea = in.nextLine();
                    fw.write(linea + "\n");
                } while (!linea.equals(""));
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }

    public static void printFile(String fileName) {
        String[] renglones = readFile(fileName);
        if (renglones != null) {
            for (String renglon : renglones) {
                System.out.println(renglon);
            }
        } else {
            System.out.println("Error al leer el archivo, creando archivo");
            writeFile(fileName);
        }
    }
}
