package com.tieumy.exercise;

public class StringEx03 {

    public int sumOfIntegersInString(final String input) {
        String str = input.replaceAll("[^0-9]+", ",");
        String[] item = str.split(",");
        int sum = 0;
        for (int i = 0; i < item.length; i++) {
            if (item[i].equals("")) sum += 0;
            else {
                int number = Integer.parseInt(item[i]);
                sum += number;
            }

        }
        return sum;
    }
}
