package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.print("Brawo Ty");// write your code here
        ArrayList<String> beskidy;
        beskidy = new ArrayList<String>();
        beskidy.add("Beskid Wyspowy");
        beskidy.add("Beskid Makowski");

        beskidy.forEach((beskid) -> System.out.println(beskid));
    }
}
