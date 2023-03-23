package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            String tableRow = String.format("%d x %d = %d", i, numberTableToPrint, numberTableToPrint * i);
            System.out.println(tableRow);
        }
    }

}
