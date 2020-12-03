package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height;

        do {
            System.out.print("Height:");
            height = input.nextInt();

        } while (height < 1 || height > 8);
        hash(height);
    }

    static void hash(int hashheight) {
        for (int h = 0; h < hashheight; h++) {


            for (int space = 0; space < hashheight - h - 1; space++) {
                System.out.print(" ");
            }

            for (int columns = 0; columns <= h; columns++) {
                System.out.print("#");
            }

            System.out.print("  ");
            for (int columns = 0; columns <= h; columns++) {
                System.out.print("#");
            }

            System.out.print("\n");
        }
    }
}