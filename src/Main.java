public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int total = 0;
        int month = 0;
        int payment = 15000;
        while (total < 2_459_000) {
            total += payment;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int population = 12_000_000;
        int birthRatePer1000 = 17;
        int deathRatePer1000 = 8;
        for (int year = 1; year <= 10; year++) {
            population += population / 1000 * (birthRatePer1000 - deathRatePer1000);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        double total = 15000;
        double increase = 0.07;
        for (int month = 1; total < 12_000_000; month++) {
            total += total * increase;
            System.out.printf("Месяц " + month + ", на счету " + "%.2f", total);
            System.out.println();
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        double total = 15000;
        double increase = 0.07;
        for (int month = 1; total < 12_000_000; month++) {
            total += total * increase;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", на счету " + "%.2f", total);
                System.out.println();
            }
        }
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        double total = 15000;
        double increase = 0.07;
        int monthsInYear = 12;
        int years = 9;
        for (int month = 1; month <= monthsInYear * years; month++) {
            total += total * increase;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", на счету " + "%.2f", total);
                System.out.println();
            }
        }
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        for (int day = 3; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("\nЗадача 8");
        int year = 2023;
        int pastYears = 200;
        int futureYears = 100;
        for (int i = 0; i <= year + futureYears; i += 79) {
            if (i >= year - pastYears) {
                System.out.println(i);
            }
        }
    }
}