package com.sofka.project;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese un dato: ");
        String dato = captura.nextLine();
        System.out.println("El dato ingresado es "+dato);
    }
}
