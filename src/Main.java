import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задания из урока do-while 1");
        int salary = 65535;
        int total = 0;
        while (total < 1_000_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println(total);
        }
        System.out.println(" задание из урока do-while 2");
        int start = 5;
        while (start > 0) {
            System.out.println(start);
            start = start - 1;
        }
        System.out.println("задание из урока do-while 3");
        int days = 10; // изначальное количество дней в Париже
        while (days > 0) {
            System.out.println(" до концп поезди осталось " + days + " дней, жеаем хорошего отдыха");
            days = days - 1;
            System.out.println("Путешествие окончено. Пора возвращаться домой.");
        }
        int i = 8;
        do {
            System.out.println(i);
            i++;
        } while (i < 7);

        int queue = 10;
        while (queue > 0) {
            System.out.println(" до вашей очереди осталось " + queue + " человек, ждите ");
            queue--;
        }
        if (queue < 1) {
            System.out.println(" вы следующий ");
        }
        System.out.println(" зача из конспекта ");
        int q = 5;
        while (q < 9) {
            System.out.println(q);
            q++;
        }


        int w = 5;
        do {
            System.out.println(w);
            w++;
        } while (w <= 10);

        int userWantToCotinue = 1;
        int lever = 1;
        do {
            System.out.println(" завершен уровень " + lever);
            System.out.println(" хотите продолжить?");
            lever++;
        } while (userWantToCotinue == 1 && lever <= 5);


        System.out.println(" Задача №1 ");

        int saveMoney = 15000;
        int allsum = 0;
        int monht = 0;
        while (allsum < 2459000) {
            allsum = allsum + saveMoney + saveMoney / 100;
            monht++;
            System.out.println(" Месяц " + monht + " сумма накоплений " + allsum + " рублей");

        }
        System.out.println(" Задача №2 ");
        int e = 1;
        while (e <= 10) {
            System.out.print(e);
            e++;
        }
        System.out.println();
        for (int s = 10; s > 0; s--) {
            System.out.print(s);
        }
        System.out.println();
        System.out.println(" Задача № 3");
        int people = 12_000_000;
        int diffPeople = people / 1000;
        int rait = 17;
        int dead = 8;
        for (int year = 1; year <= 10; year++) {
            people = people + (diffPeople * (rait - dead));
            System.out.println(" год " + year + " численность начеления составляет " + people);
        }
        System.out.println(" Задача №4 ");
        int firstMoney = 15000;
        int percent = firstMoney * 7 / (100);
        int needMoney = 12_000_000;
        int month = 0;
        int totalAccumulation = 0;
        while (totalAccumulation < needMoney) {
            month++;
            firstMoney = firstMoney + percent;
            totalAccumulation = totalAccumulation + firstMoney;
            System.out.println(" месяц " + month + " сумма накоплений равна " + totalAccumulation);
        }
        System.out.println(" Задача №5");
        int firstMoney1 = 15000;
        int percent1 = firstMoney1 * 7 / (100);
        int needMoney1 = 12_000_000;
        int totalAccumulation1 = 0;
        int period = 6;
        for (int month1 = 1; totalAccumulation1 <= needMoney1; month1 = month1 + 1) {
            firstMoney1 = firstMoney1 + percent1;
            totalAccumulation1 = totalAccumulation1 + firstMoney1;
            if (month1 % period == 0) {
                System.out.println(" месяц " + month1 + " сумма накоплений равна " + totalAccumulation1);
            }

        }
        System.out.println(" Задача №6 ");
        int allPeriod = 9;
        int checkPeriod = 6;
        int startMoney = 15000;
        double percentBank = 0.07;
        int allMonth = allPeriod * 12;
        for (int month2 = 1; month2 <= allMonth; month2++) {
            startMoney = (int) (startMoney + startMoney * percentBank);
            if (month2 % checkPeriod == 0) {
                System.out.println("сумма " + startMoney + " рублей в накоплении состваляет каждый  " + month2 + " " +
                        "месяц ");
            }


        }
        System.out.println(" Задача №7 ");
        int fr = 1;
        for (fr = 1; fr < 31; fr += 7) {
            System.out.println(" Сегодня пятница, " + fr + " -е число. Необходимо подготовить отчет");
        }

        System.out.println(" Задача №8  ");
        int year = 2024;
        for (int periodMeeting = 0; periodMeeting < year + 100; periodMeeting += 79) {
            if (periodMeeting > year - 200) {
                System.out.println(periodMeeting);
            }


        }


    }
}







