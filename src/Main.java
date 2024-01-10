import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        while (true) {
            Menu.print();
            action = scanner.nextInt();
            if (action == 1) {
                Tracker.action1();
                break;
            }
            else if (action == 2) {
                Tracker.action2();
                break;
            }
            else if (action == 3) {
                Tracker.action3();
                break;
            }
            else if (action == 4) {
                System.out.println("Работа программы прекращена.");
                break;
            }
            else {
                System.out.println("Вы ввели некорректное значение. Введите цифру от 1 до 5;");
                break;
            }

        }
    }

}
