package com.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenArray = scanner.nextInt();
        scanner.close();

        int[] array = new int[lenArray]; 
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); 
        }

        System.out.println(Arrays.toString(array));
        System.out.println(mediumDigit(array));
        
    }

    public static double mediumDigit(int[] array){
        int sumArr = 0;
        for (int i = 0; i < array.length; i++) {
            sumArr += array[i];
        }
        return sumArr/array.length;
    }

}
