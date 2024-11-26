package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();

    public void startGrocery(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("1. Add items");
        System.out.println("2. Remove items");
        System.out.println("0. Exit");
        while(true){

            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 0){
                return;
            } else if(choice == 1){
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String input = scanner.nextLine();
                addItems(input);
                System.out.println(groceryList);

            } else if(choice == 2){
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                String input = scanner.nextLine();
                removeItems(input);
                System.out.println(groceryList);

            }
        }

    }
    public static void addItems(String input){
        String[] inputArray = input.split(",");
        for (String item : inputArray) {
            item = item.trim();
            if(!checkItemIsInList(item)){
                groceryList.add(item);

            }
        }

        printSorted();
    }
    public static void removeItems(String input){
        String[] inputArray = input.split(",");
        for (String s : inputArray) {
            s = s.trim();
            if(checkItemIsInList(s)){
                groceryList.remove(s);

            }
        }

        printSorted();
    }
    public static boolean checkItemIsInList(String product){
       return groceryList.contains(product);
    }

    public static void printSorted(){
        Collections.sort(groceryList);

    }
}
