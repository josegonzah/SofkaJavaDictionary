package com.sofka.project;

import java.util.Scanner;

public class Activity2 {
    static int calculateSum(String number){
        int sum = 0;
        for (int i=0; i<number.length();i++){
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum;
    }

    static String reverseString(String number){
        String inverseNumber = "";
        for (int i=0; i<number.length();i++){
            inverseNumber  = inverseNumber + number.charAt(number.length()-1-i);
        }
        return inverseNumber;
    }

    public static void main(String[] args) {
        String number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número deseado: ");
        number = scanner.nextLine();

        int sum = calculateSum(number);
        String inverseNumber = reverseString(number);

        System.out.println("La sumatoria de los digitos es: " + sum);
        System.out.println("El número invertido es: "+ inverseNumber);
    }
}
