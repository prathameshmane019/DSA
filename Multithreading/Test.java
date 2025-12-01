package Multithreading;

import java.util.*;

class UserMainCode {
    public String goldcoins(int input1, String[] input2, int input3) {
        String result = "";
        int maxValue = Integer.MIN_VALUE; 
        for (String coin : input2) {
            // Split on hyphen to separate year and original value
            String[] parts = coin.split("-");
            String yearStr = parts[0].substring(1); // remove 'Y'
            int year = Integer.parseInt(yearStr);
            int originalValue = Integer.parseInt(parts[1]);

            int age = input3 - year;
            int resaleValue = originalValue + age * 5;

            if (resaleValue > maxValue) {
                maxValue = resaleValue;
                result = coin;
            }
        } 
        return result;
    }
}

public class Test {

    public static void main(String[] args) {
        UserMainCode us = new UserMainCode();
        String[] coins = {"Y2010-5", "Y2012-3"};
        System.out.println(us.goldcoins(2, coins, 2023));
    }
}