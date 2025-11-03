package edu.zuj.oop;

import java.util.Scanner;

public class w2_task1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1- Horizontal Line ");
        System.out.println("2- Vertical Line ");
        System.out.println("3- Square");
        System.out.println("4- Right Diagonal");
        System.out.println("5- Left Diagonal");
        System.out.println("6- Right Triangle");
        System.out.println("7- Left Triangle");
        System.out.println("8- Diamond ");
        System.out.print("Enter your choice : ");
        int ch = s.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter a number :");
                int x = s.nextInt();
                for (int i = 0; i < x; i++) {
                    System.out.print("*");
                }
                break;

            case 2:
                System.out.print("Enter a number :");
                x = s.nextInt();
                for (int i = 1; i <= x; i++) {
                    System.out.println("*");
                }
                break;

            case 3:
                System.out.print("Enter a number :");
                x = s.nextInt();

                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < x; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;

            case 4:
                System.out.print("Enter a number :");
                x = s.nextInt();
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                break;

            case 5:
                System.out.print("Enter a number :");
                x = s.nextInt();

                for (int i = 0; i < x; i++) {
                    for (int j = i; j < x; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                break;

            case 6:
                System.out.print("Enter anumber :");
                x = s.nextInt();

                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;

            case 7:
                System.out.print("Enter a number :");
                x = s.nextInt();

                for (int i = 1; i <= x; i++) {
                    for (int j = 1; j <= x - i; j++) {
                        System.out.print(" ");
                    }
                    for (int p = 0; p < i; p++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 8:
                System.out.print("Enter a number :");
                x = s.nextInt();

                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < x - i - 1; j++) {
                        System.out.print(" ");
                    }

                    for (int f = 0; f < 2 * i + 1; f++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = x - 2; i >= 0; i--) {
                    for (int j = 0; j < x - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int f = 0; f < 2 * i + 1; f++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                throw new AssertionError();
        }

    }
}
