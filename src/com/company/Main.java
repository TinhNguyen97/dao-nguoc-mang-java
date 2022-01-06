package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        System.out.print("Nhập số lượng phần tử: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử số " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng array là: ");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int z = 0; z < array.length / 2; z++) {
            int temp=array[z];
            array[z]=array[array.length-1-z];
            array[array.length-1-z]=temp;

        }
        System.out.print("\n" + "Mảng array sau khi đảo ngược là: ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + "\t");
        }
    }
}