package com.dmytrolystovets;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0, nextJ = 1; j < arr.length - 1 - i; j++, nextJ++) {
                if (arr[j] < arr[nextJ]) {
                    int buffer = arr[j];
                    arr[j] = arr[nextJ];
                    arr[nextJ] = buffer;
                    swapped = true;
                }
            }
            if (!swapped) break;

        }
        for (int e : arr) System.out.print(e + " ");


    }

}