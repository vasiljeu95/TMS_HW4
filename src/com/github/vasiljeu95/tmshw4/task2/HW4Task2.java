package com.github.vasiljeu95.tmshw4.task2;

import java.util.Scanner;
import java.util.Random;

public class HW4Task2 {
    public static void main(String[] args) {
        int [] range = {0, 1000};

        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();

        String[] numArr = nums.split(" ");

        int num1 = Integer.parseInt(numArr[0]);
        int num2 = Integer.parseInt(numArr[1]);
        int num3 = Integer.parseInt(numArr[2]);

        Random random = new Random();
        int [][][] array = new int[num1][num2][num3];
        int maxNum = range[0];
        int minNum = range[1];

        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array[k].length; i++) {
                for (int j = 0; j < array[k][i].length; j++) {
                    int q = random.nextInt(range[0], range[1]);
                    array[k][i][j] = q;
                    if (q > maxNum) {
                        maxNum = q;
                    }
                    if (q < minNum) {
                        minNum = q;
                    }
                }
            }
        }
        System.out.println("Min = " + minNum + ", Max = " + maxNum);
    }
}
