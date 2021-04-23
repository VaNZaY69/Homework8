package com.Homework8;
/*
2) Найти количество счастливых билетиков на трамвай от
000001 до 999999 (те у которых сумма первых 3 цифр равна сумме последних 3)
 */
public class Task2 {
    public static void main(String[] args) {
        int luckyTickets = 0;
        int[] arrayTickets = new int[27];
        for (int i = 1; i <= 999; i++) {
            arrayTickets[sumTickets(i) - 1]++;
        }
        for (int i : arrayTickets) {
            luckyTickets += i * i;
        }
        System.out.println("Number of lucky tickets: " + luckyTickets);
    }

    private static int sumTickets(int a) {
        return (a < 10) ? a : (a % 10 + sumTickets(a / 10));
    }
}

