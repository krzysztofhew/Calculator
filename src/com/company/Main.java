package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addAToB(5, 23);
        System.out.println(calculator.subtractionAFromB(456.678, 12.234));
        System.out.println("It works!");
    }
}
