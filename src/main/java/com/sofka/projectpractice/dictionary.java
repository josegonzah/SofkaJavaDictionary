package com.sofka.projectpractice;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dictionary {
    public static void main(String[] args){
        Map<String, String> dictionary = loadDictionary();
        mainMenu(dictionary);
    }

    public static void setDictionaryEntry(String key, String value, Map dictionary){
        dictionary.put(key, value);
    }

    public static String returnMeaning(String word, Map dictionary){
        String meaning = (String) dictionary.get(word);
        return meaning;
    }

    public static void saveDictionary(Map<String, String> map) {
        File file = null;
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileWriter("dictionary.txt"));

            for (Map.Entry<String, String> entry : map.entrySet()){
                pw.write(entry.getKey() + ":" + entry.getValue() +"\n");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (pw != null){
                    pw.close();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        pw.close();
    }

    public static void showFullDictionary(Map<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void mainMenu(Map<String, String> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este es su diccionario ingles/español");
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1. Consultar traduccion(ingles/español)");
        System.out.println("2. Ingresar entrada al diccionario");
        System.out.println("3. Ver todo el diccionario");

        String option = scanner.nextLine();
        executeOption(option, map);

    }

    public static void executeOption(String option, Map<String, String> map){
        switch (option){
            case "1": checkDictionary(map);
            break;
            case "2": addDictionaryEntry(map);
            break;
            case "3": showFullDictionary(map);
            break;
        }
    }

    public static void addDictionaryEntry(Map<String, String> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra en ingles que desea agregar: ");
        String key = scanner.nextLine();
        System.out.println("Ingrese la traduccion en español: ");
        String value = scanner.nextLine();
        setDictionaryEntry(key, value, map);
        saveDictionary(map);
    }

    public static void checkDictionary(Map<String, String> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra en ingles que desea consultar: ");
        String key = scanner.nextLine();
        String value = returnMeaning(key, map);
        System.out.println(key + " significa: " + value);
    }


    public static Map<String, String> loadDictionary(){
        Map<String, String> dictionary = new HashMap<String, String>();
        try(BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"))){
            String line;
            while((line = br.readLine()) != null){
                String[] keyValuePair = line.split(":");
                String key = keyValuePair[0];
                String value = keyValuePair[1];
                dictionary.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dictionary;
    }
}
