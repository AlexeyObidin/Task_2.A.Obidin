package com.company;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) {
        Scanner str = new Scanner(System.in);
        String i;
        i = str.nextLine();
        if (i.equals("Вячеслав")){
            System.out.print("Привет, Вячеслав");
        } else {
            System.out.print ("Нет такого имени");
        }
    }
}
