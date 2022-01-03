package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Задание 1
        int count = 1;
        while (count <= 10) {
            System.out.print("" + count);
            count++;
        }
        System.out.println();

        for (int countDown = 10; countDown >= 1; countDown--) {
            System.out.print("" + countDown);
        }
        System.out.println();
        // Задание 2
        int j = 1;
        for (; j <= 31; j = j + 7) {
            System.out.println("Сегодня отчет:" + j + "-ое число. Необходимо подготовить отчет");
        }
        // Задание 3
        int yearNow = 2022;
        int yearBefore = yearNow - 200;
        int yearAfter = yearNow + 100;
        for (yearNow = yearBefore; yearNow < yearAfter; yearNow++)
            if (yearNow % 79 == 0) {
                System.out.println(yearNow);
            }
    }
}






