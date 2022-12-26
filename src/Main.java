public class Main {
    public static void main(String[] args) {
        task();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task() {
        System.out.println("Задание 1");
        int monthlySavings = 15_000;
        int total = 0;
        int month = 1;
        while (total < 2_549_000) {
            total += monthlySavings;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей.");
            month++;
        }
    }

    public static void task1() {
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int q = 10; q >= 1; q--) {
            System.out.print(q + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 3");
        int countryY = 12_000_000;
        int i = countryY / 1000;
        int birthRate = 17;
        int mortality = 8;
        int addingPeoplePerYear = birthRate - mortality;
        int year = 0;
        while (year < 10) {
            year++;
            countryY = countryY + ((i * addingPeoplePerYear));
            System.out.println("Год " + year + " , численность населения составляет " + countryY);
        }


    }

    public static void task3() {
        System.out.println("Задание 4");
        double percentageOfTheDeposit = 1.07;
        double contribution = 15_000;
        int month = 0;
        double total = 0;
        while (total < 12_000_000) { // цикл работает пока не дойдет до 12млн
            month++;//считаем кол-во месяцев
            contribution = contribution * percentageOfTheDeposit;// вычисляем какой процент накоплений получим за месяц
            total = contribution + total;//прибовляем процент с накполением
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task4() {
        System.out.println("Задание 5");
        double percentageOfTheDeposit = 1.07;
        double contribution = 15_000;
        int month = 1;
        double total = 0;
        while (total < 12_000_000) { // цикл работает пока не дойдет до 12млн

            contribution = contribution * percentageOfTheDeposit;// вычисляем какой процент накоплений получим за месяц
            total = contribution + total;//прибовляем процент с накполением
            month++; //считаем кол-во месяцев
            if (month % 6 == 0) {// вычисляем каждый 6 месяц и только после этого выводим
                System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей.");
            }
        }
        System.out.println("всего потребовалось месяцев " + month + " что бы накопить " + total);
    }

    public static void task5() {
        System.out.println("Задание 6");
        double percentageOfTheDeposit = 1.07;
        double contribution = 15_000;
        int year = 9;
        int month = year * 12;
        double total = 0;
        for (int i = 1; i <= month; i++) {
            contribution = contribution * percentageOfTheDeposit;
            total = contribution + total;
            if (i % 6 == 0) {
                System.out.println("Месяц = " + i + " накопления = " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задание 7");
        int dayOfTheWeek = 2;
        for (int i = 2; dayOfTheWeek < 31; i+=7){
        dayOfTheWeek+= +7;
            System.out.println("Сегодня пятница, " + i +" е число. Необходимо подготовить отчет");
        }

    }
    public static void task7(){
        System.out.println("Задание 8");
        int year = 200;
        if (year >= 200) {
            int yearAgo200 = year - 200;
            int yearAhead100 = year + 100;
            while (yearAgo200 < yearAhead100) {
                yearAgo200 += +79;
                if (yearAgo200 < yearAhead100) {
                    System.out.println(yearAgo200);
                }
            }
        }
        else {
                System.out.println("Введите год больше 200");
            }
    }
}

