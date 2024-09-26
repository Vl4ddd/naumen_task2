package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenArray = scanner.nextInt();
        scanner.close();

        ArrayList<Double> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < lenArray; i++) {
            arrayList.add(random.nextDouble() * 100);
        }

        System.out.println(arrayList.toString());
        System.out.println(bubbleSort(arrayList, lenArray));

    }

    public static ArrayList<Double> bubbleSort(ArrayList<Double> arrayList, int lenArray){
        for (int i = 0; i < lenArray - 1; i++){
            for (int j = 0; j < lenArray - 1 - i; j++){
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    double temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }


        return arrayList;
    }
}