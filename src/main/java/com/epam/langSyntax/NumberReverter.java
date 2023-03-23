package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int invertedResult = 0;
        for (; number > 0; number /= 10) {
            int rightMostDigit = number % 10;
            invertedResult = invertedResult * 10 + rightMostDigit;
        }
        System.out.println(invertedResult);
    }

}
