import java.util.Scanner;

public class Tracker {

    public static void action1() {
        Scanner console = new Scanner(System.in);
        //задаём целевое количество шагов по конкретной дате
        System.out.println("Введите месяц от 1 до 12 включительно");
        int month = console.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Вы ввели некорректное значение, пожалуйста, введите номер месяца от 1 до 12 включительно.");

        }
        System.out.println("Введите день от 1 до 30 включительно");
        int day = console.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Вы ввели некорректное значение, пожалуйста, введите номер дня от 1 до 30 включительно.");

        }
        System.out.println("Введите желаемое количество шагов");
        int steps = console.nextInt();
        GoalSteps.goalSteps(month, day, steps);

    }

    public static void action2() {
        Scanner console = new Scanner(System.in);
        //задаём количество фактически пройденных шагов по конкретной дате
        System.out.println("Введите месяц от 1 до 12 включительно;");
        int month = console.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Вы ввели некорректное значение, пожалуйста, введите номер месяца от 1 до 12 включительно.");
        }
        System.out.println("Введите день от 1 до 30 включительно;");
        int day = console.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Вы ввели некорректное значение, пожалуйста, введите номер дня от 1 до 30 включительно.");
        }

        System.out.println("Введите количество пройденных шагов;");
        int steps = console.nextInt();
        Steps.realSteps(month, day, steps);

    }

    public static void action3() {
        //выводим статисику
        Statistic.getStatistic();
    }


}
