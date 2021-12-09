package com.github.vasiljeu95.tmshw4.task4;

import java.util.Random;
import java.util.Scanner;

public class HW4Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int [][] array = new int[num][num];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.abs(i-j)+1;

                System.out.print(array[i][j]);
                System.out.print(j == (array[i].length - 1) ? "" : " ");
                }
            System.out.println();
        }
    }
}
