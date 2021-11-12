package com.sofka.project;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        String userName;
        String cellphone;
        String age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre de usuario: ");
        userName = scanner.nextLine();
        System.out.println("Celular: ");
        cellphone = scanner.nextLine();
        System.out.println("Edad: ");
        age = scanner.nextLine();

        System.out.println("Bienvenido señor " + userName +
                ", es un placer para nosotros contar con una persona de " + age + " años.");
        System.out.println("Próximamente nos comunicaremos con usted al numero " + cellphone + ".");
        System.out.println("Feliz día");

    }
}
