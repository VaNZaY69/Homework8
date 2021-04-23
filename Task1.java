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
        String strhours;
        String strminutes;

        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                if (hours < 10) {
                    strhours = "0" + hours;
                } else {
                    strhours = String.valueOf(hours);
                }
                if (minutes < 10) {
                    strminutes = "0" + minutes;
                } else {
                    strminutes = String.valueOf(minutes);
                }
                StringBuilder tmp = new StringBuilder(strhours);
                if (tmp.reverse().toString().equals(strminutes)) {
                    System.out.println(strhours + ":" + strminutes);
                    result++;
                }
            }
        }
        System.out.println("Total " + result + " coincidences.");
    }
}
