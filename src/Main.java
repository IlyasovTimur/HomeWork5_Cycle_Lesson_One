public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork5_Cycle_Lesson_One");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task9() {

        System.out.println("Задание 9.");
        int cash = 29000;
        int totalSum = 0;
        for (int i = 1; i <= 12; i++) {
            totalSum += totalSum/100; // + 1%
            totalSum += cash;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, totalSum);
        }
    }

    private static void task8() {
        System.out.println("Задание 8.");

        int cash = 29000;
        int totalSum = 0;
        for (int i = 1; i <= 12; i++) {
            totalSum += cash;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i,totalSum);
        }
    }

    private static void task7() {
        System.out.println("Задание 7.");

        for (int i = 1; i < 513; i += i ) {
            System.out.println(i);
        }
    }

    private static void task6() {
        System.out.println("Задание 6.");

        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }
    }

    private static void task5() {
        System.out.println("Задача 5.");

        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + "год является високосным.");
        }
    }

    private static void task4() {
        System.out.println("Задача 4.");

        for (int i = 10; i != - 11; i--){
            System.out.println(i);
        }
    }

    private static void task3() {
        System.out.println("Задача 3.");

        for (int i = 0; i < 17; i += 2){
            System.out.println(i);
        }
    }

    private static void task2() {
        System.out.println("Задача 2.");

        for (int i = 10; i != 0; i--){
            System.out.println(i);
        }
    }

    private static void task1() {
        System.out.println("Задача 1.");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}