import java.util.Scanner;

public class Statistic {
    public static void getStatistic() {
        while (true) {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите номер желаемого действия:\n" +
                    "1 - вывод информации по целевым шагам за указанный месяц;\n" +
                    "2 - вывод информации по фактически пройденным шагам за указанный месяц;\n" +
                    "3 - максимальное количество шагов в месяце;\n" +
                    "4 - лучшая серия: максимальное количество подряд идущих дней,\n" +
                    " в течение которых количество шагов за день было равно или выше целевого;\n" +
                    "5 - перевести пройденные шаги в килметры;\n" +
                    "6 - возврат в главное меню.");
            int i = console.nextInt();
            if (i == 1) {
                GoalSteps.goalStepsOutput();
            } else if (i == 2) {
                Steps.stepsOutput();
            } else if (i == 3) {
                maxSteps();
                break;
            } else if (i == 4) {
                stepsSeries();
                break;
            } else if (i == 5) {
                kmTrans();
                break;
            } else if (i == 6) {
                break;
            } else {
                System.out.println("Введено некорректное значение. Ввведите число от 1 до 6.");
            }
        }

    }

    public static void stepsSeries() {
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь",};
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int counter = 0;
        int[] bestStepSeries = new int[30];
        int i = console.nextInt();
        for (int j = 0; j < 30; j++) {
            if (Steps.dateSteps[i][j] >= GoalSteps.goalSteps[i][j]) {
                bestStepSeries[j] = Steps.dateSteps[i][j];
                if (bestStepSeries[j] != 0) {
                    counter++;
                }
            }
        }
        System.out.println("За выбранный Вами месяц - " + months[i] + ", максимальное количество подряд идущих дней,\n" +
                " в течение которых количество шагов за день было равно или выше целевого составляет " + counter + " дня/дней.\n");
        System.out.println();
    }

    public static void maxSteps() {
        int maxStep = Integer.MIN_VALUE;
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь",};
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12 включительно;");
        int i = console.nextInt();
        for (int j = 0; j < 30; j++) {
            if (Steps.dateSteps[i][j] > maxStep) {
                maxStep = Steps.dateSteps[i][j];
            }
        }
        System.out.println("Максимальное заначение шагов в выбранном Вами месяце - " + months[i] + ", составляет " + maxStep + " шагов/шага.");
        System.out.println();
    }

    public static void kmTrans() { // перевод пройденных шагов в километры;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер Вашего шага в сантиметрах;");
        double stepValue = console.nextDouble();
        stepValue = stepValue / 100000; // перевод в км
        if (stepValue > 0) {
            System.out.println("Введите номер месяца от 1 до 12 включительно;");
            int i = console.nextInt();
            if (i >= 1 && i <= 12) {
                System.out.println("Введите номер дня от 1 до 30 включительно;");
                int j = console.nextInt();
                if (j >= 1 && j <= 30) {
                    System.out.println("За этот день вы прошли " + Steps.dateSteps[i][j] + " шагов, что равняяется " + stepValue * Steps.dateSteps[i][j] + " км");
                } else {
                    System.out.println("Вы ввели некорректное значение номера месяца, введите число от 1 до 30 включительно.");
                    getStatistic();
                }
            } else {
                System.out.println("Вы ввели некорректное значение номера месяца, введите число от 1 до 12 включительно.");
                getStatistic();
            }
        } else {
            System.out.println("Вы ввели некорректное значение размера Вашего шага, попробуйте заново.");
            getStatistic();
        }
    }
}
