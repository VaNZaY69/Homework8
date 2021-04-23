package com.Homework8;

/*
1) Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия
показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */
public class Task1 {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                String hoursDisplay = String.format("%02d", i);
                String minutesDisplay = String.format("%02d", j);
                String reversedHours = new StringBuilder(hoursDisplay).reverse().toString();
                if (minutesDisplay.equals(reversedHours)) {
                    result++;
                }
            }
        }
        System.out.println("Total " + result + " coincidences.");
    }
}
