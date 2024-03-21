import java.util.Scanner;

public class TaskTwoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел
        System.out.println("Введите первое целое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции со значениями
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("Невозможно выполнить деление на 0");
        }
        System.out.println("a * b = " + (a * b));
    }
}
