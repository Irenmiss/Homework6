public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 6.1.1.");
        int savingsInMonth = 15000;
        int totalSavings = 0;
        int i = 0;
        while (totalSavings < 2_459_000) {
            totalSavings += savingsInMonth;
            totalSavings += (totalSavings / 100);
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей.");
        }

        System.out.println("Задание 6.1.2.");
        int a = 0;
        while (a <= 10) {
            a++;
            System.out.print(" " + a + " ");
        }
        System.out.println();
        for (int b = 10; b >= 0; b--) {
            System.out.print(" " + b + " ");
        }
        System.out.println();
        System.out.println("Задание 6.1.3.");
        int population = 12_000_000;
        int birthRateInYear = 17;
        int mortalityRateInYear = 8;
        for (int c = 1; c <= 10; c++) {
            population += (population * (birthRateInYear - mortalityRateInYear)) / 1000;
            System.out.println("Год " + c + ", численность населения составляет " + population + " человек.");
        }
        System.out.println("Задание 6.2.1.");
        double totalSavingsOfVasiliy = 15000;
        int d = 0;
        while (totalSavingsOfVasiliy <= 12_000_000) {
            totalSavingsOfVasiliy += totalSavingsOfVasiliy * 0.07;
            d++;
            System.out.println("Месяц " + d + ", сумма накоплений Василия равна " + totalSavingsOfVasiliy + " рублей.");
        }
        System.out.println("Задание 6.2.2.");
        double totalSavingsOfVasiliy1 = 15000;
        int e = 0;
        while (totalSavingsOfVasiliy1 <= 12_000_000) {
            totalSavingsOfVasiliy1 += totalSavingsOfVasiliy1 * 0.07;
            e++;
            if (e % 6 == 0) {
                System.out.println("Месяц " + e + ", сумма накоплений Василия равна " + totalSavingsOfVasiliy1 + " рублей.");
            }
        }
        System.out.println("Задание 6.2.3.");
        double totalSavingsOfVasiliy2 = 15000f;
        int f = 0;
        while (f <= 12 * 9) {
            totalSavingsOfVasiliy2 += totalSavingsOfVasiliy2 * 0.07;
            f++;
            if (f % 6 == 0) {
                System.out.println("Месяц " + f + ", сумма накоплений Василия равна " + totalSavingsOfVasiliy2 + " рублей.");
            }
        }

        System.out.println("Задание 6.2.4.");
        int firstFridayInMonth = 4;
        for (; firstFridayInMonth <= 31; firstFridayInMonth += 7) {
            System.out.println("Сегодня пятница, " + firstFridayInMonth + " число. Необходимо подготовить отчет.");
        }

        System.out.println("Задание 6.3.1.");
        int cometNearEarth = 0;
        int currentYear = 2022;
        int future100Years = currentYear + 100;
        int last200Years = currentYear - 200;
        while (cometNearEarth <= future100Years) {
            cometNearEarth = cometNearEarth + 79;
            if (cometNearEarth >= last200Years && cometNearEarth < future100Years) {
                System.out.println(cometNearEarth);
            }
        }
        System.out.println("Задание 6.3.2.");
        for (int j = 1; j <= 10; j++) {
            int result = 2 * j;
            System.out.println ("2*" + j + "=" + result);
        }
    }
}