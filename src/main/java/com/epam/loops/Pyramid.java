package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int i = cathetusLength; i > 0; i--) {
                if (i <= row) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            for (int i = 2; i <= row; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
