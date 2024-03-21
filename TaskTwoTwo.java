import java.util.Scanner;

public class TaskTwoTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первой строки
        System.out.println("Введите первую строку (a):");
        String a = scanner.nextLine();

        // Ввод второй строки
        System.out.println("Введите вторую строку (b):");
        String b = scanner.nextLine();

        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}
