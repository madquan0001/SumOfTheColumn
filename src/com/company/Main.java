package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int b, c, d, tong = 0;
        System.out.printf("Imput rows : ");
        c = scanner.nextInt();
        System.out.printf("Imput columns : ");
        d = scanner.nextInt();
        float a[][] = new float[c][d];

        for (int i = 0 ; i < c ; i++)
        {
            for (int j = 0 ; j < d ; j++)
            {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The array you just entered is : ");
        for (int i = 0 ; i < c ; i++)
        {
            for (int j = 0 ; j < d ; j++)
            {
                System.out.print("a[" + i + "][" + j + "] = " + a[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.printf("Imput the column you want to calculate the sum : ");
        b = scanner.nextInt();
        for (int i = 0 ; i < c ; i++)
        {
            tong += a[i][b];
        }
        System.out.println("Sum of the column you chose is : " + tong);
    }
}