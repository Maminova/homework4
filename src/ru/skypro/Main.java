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

        for (int countdown = 10; countdown > 0; countdown --) {
            System.out.print("" + countdown);
        }
        System.out.println();
        // Задание 2

        for (int j = 1; j <= 31; j = j+7){
            System.out.println("Сегодня отчет:" + j +"-ое число. Необходимо подготовить отчет");
}
            // Задание 3
            int year = 2022;
            int yearBefore = year - 200;
            int yearAfter = year + 100;
            for (year = yearBefore; year < yearAfter; year = year + 79){
                System.out.println(year);
            }
        }

        }



