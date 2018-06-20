import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальное значение? ");
        int min = scanner.nextInt();
        System.out.print("Введите максимальное значение? ");
        int max = scanner.nextInt();

        int range = min + (int) (Math.random()*max); // int random = (int) (min + (Math.random() * (max - min + 1);
        // лучше использовать то, что в комменте

        System.out.printf("Случайно число от %d до %d : %d", min, max, range);

        //int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        //System.out.println("1-ое случайное число: " + random_number1);

    }

}
