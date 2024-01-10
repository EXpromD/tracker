import java.util.Scanner;

public class StepsNew {
    static int[][] dateSteps = new int[12][30];
    static int[][] goalSteps = new int[12][30];
    public static void realSteps(int month, int day, int steps) {
        /*метод принимает на вход от пользователя первичные 3 значения из класса Main,
        записывает их в массив с шагами  dateSteps, а после предлагает либо ещё раз дописать,
        либо вернуться в главное меню*/
        while (true) {
            dateSteps[month][day] = steps;
            System.out.println("На выбранную дату " + month + "/" + day + " вы прошли " + steps + " шаг(шагов)");
            System.out.println();
            System.out.println("Желаете ввести ешё одно значение пройденных шагов?\n" +
                    "   1 - да\n" +
                    "   2- вернуться в главное меню");
            Scanner console = new Scanner(System.in);
            int i = console.nextInt();
            if (i == 1) {
                System.out.println("Введите месяц от 1 до 12 включительно;");
                month = console.nextInt();
                if (month < 1 || month > 12) {
                    System.out.println("Вы ввели некорректное значение, пожалуйста, введите номер месяца от 1 до 12 включительно.");
                    break;
                }
                System.out.println("Введите день от 1 до 30 включительно;");
                day = console.nextInt();
                if (day < 1 || day > 30) {
                    System.out.println("Вы ввели некорректное значение, пожалуйста, введите номер дня от 1 до 30 включительно.");
                    break;
                }
                System.out.println("Введите количество пройденных шагов;");
                steps = console.nextInt();
                dateSteps[month][day] = steps;
            } else if (i == 2) {
                break;
            } else {
                System.out.println("Ввведите либо число 1, либо число 2;");
            }

        }
    }

    public static void goalSteps(int month, int day, int steps) {
        /*метод принимает на вход от пользователя первичные 3 значения из класса Main,
        записывает их в массив с шагами  dateSteps, а после предлагает либо ещё раз дописать,
        либо вернуться в главное меню*/
        while (true) {
            goalSteps[month][day] = steps;
            System.out.println("На выбранную дату " + month + "/" + day + " вы установили цель " + steps + " шаг(шагов)");
            System.out.println();
            System.out.println("Желаете ввести ешё одно значение целевых шагов?\n" +
                    "   1 - да\n" +
                    "   2- вернуться в главное меню");
            Scanner console = new Scanner(System.in);
            int i = console.nextInt();
            if (i == 1) {
                System.out.println("Введите месяц от 1 до 12 включительно;");
                month = console.nextInt();
                if (month < 1 || month > 12) {
                    System.out.println("Вы ввели некорректное значение, пожалуйста, введите номер месяца от 1 до 12 включительно.");
                    break;
                }
                System.out.println("Введите день от 1 до 30 включительно;");
                day = console.nextInt();
                if (day < 1 || day > 30) {
                    System.out.println("Вы ввели некорректное значение, пожалуйста, введите номер дня от 1 до 30 включительно.");
                    break;
                }
                System.out.println("Введите желаемое количество шагов;");
                steps = console.nextInt();
                goalSteps[month][day] = steps;
            } else if (i == 2) {
                break;
            } else {
                System.out.println("Ввведите либо число 1, либо число 2;");
            }

        }
    }

    public static void stepsOutput() {
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь",};
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12 включительно.");
        int i = console.nextInt();
        System.out.print(months[i-1]);
        System.out.println();
        if (i >=1 && i <= 12) {
            for (int j = 0; j < 30; j++) {
                System.out.println("День " + (j+1));
                System.out.println(dateSteps[i-1][j] + " ");
            }
        }
        else {
            System.out.println("Вы ввели некорректное значение, пожалуйста, введите номер месяца от 1 до 12 включительно.");
        }
        System.out.println();
        System.out.println();

    }
}

