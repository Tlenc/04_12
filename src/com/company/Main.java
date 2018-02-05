package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	System.out.println("Nustatytike masyvod dydį :");
        Scanner sc = new Scanner(System.in);
        int dyd = sc.nextInt();
        int[] mas = new int[dyd];
        for (int i = 0;i<mas.length;i++){
            try {
                System.out.println("Įveskite sveikajį " + i + " masyvo skaičių :");
                mas[i] = sc.nextInt();
            }catch (Exception e){
                System.out.println("Galimi tik sveikieji skaičiai");
            }
        }
     System.out.println("Didžiausias skaičius : " +masmax(mas));
    }
    public static int masmax(int mas[]){
        int max = mas[0];
        for(int i = 1;i<mas.length;i++){
            if (max < mas[i]){
                max = mas[i];
            }
        }
        return max;
    }
}
