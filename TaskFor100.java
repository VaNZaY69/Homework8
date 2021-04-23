package com.Homework8;
/*
Баланс скобок. Дана конечная последовательность, состоящая из левых и правых скобок различных
заданных типов. Определить, можно ли добавить в нее цифры и знаки арифметических действий так,
чтобы получилось правильное арифметическое выражение.
Примеры:
1 ( NO
2 )) NO
3 [} NO
4 {} YES
5 (){}[] YES
6 ({[]}{}) YES
7 [({}())[] NO
 */
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskFor100 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a sequence of brackets (to exit? enter \"Exit\"):");
            String strBrackets = scanner.next();
            while (!strBrackets.equalsIgnoreCase("Exit")) {
                if (valid(strBrackets)) {
                    System.out.println(" YES");
                } else {
                    System.out.println(" NO");
                }
                strBrackets = scanner.next();
            }
        }
    }

    private static boolean valid(String strBrackets) {
        Deque<Integer> list = new LinkedList<>();
        for (char symbols : strBrackets.toCharArray()) {
            int index = "{[(}])".indexOf(symbols);
            if (index >= 0) {
                if (index >= 3) {
                    if ((list.size() == 0) || (list.poll() != index - 3)) {
                        return false;
                    }
                } else {
                    list.push(index);
                }
            }
        }
        return list.isEmpty();
    }
}
