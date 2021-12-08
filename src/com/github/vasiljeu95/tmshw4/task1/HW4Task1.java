package com.github.vasiljeu95.tmshw4.task1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class HW4Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();

        String[] numArr = nums.split(" ");

        int num1 = Integer.parseInt(numArr[0]);
        int num2 = Integer.parseInt(numArr[1]);

        Random random = new Random();
        int [][] array = new int[num1][num2];
        int maxNum = -100;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int q = random.nextInt(-100, 100);
                array[i][j] = q;
                if (q > maxNum) {
                    maxNum = q;
                }
                System.out.print(array[i][j]);
                System.out.print(j == (array[i].length - 1) ? "" : " ");
            }
            System.out.println();
        }

        System.out.println("Max = " + maxNum);
    }
}
