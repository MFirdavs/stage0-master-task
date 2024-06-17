package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int first = number / 100;
        int second = (number % 100) / 10;
        int third = number % 10;
        System.out.println(third * 100 + second * 10 + first);
    }

}
