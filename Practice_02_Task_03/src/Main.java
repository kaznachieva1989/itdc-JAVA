import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четырёхзначное число? ");
        int number = scanner.nextInt();

        int sum = number/1000 + number/100%10 + number/10%10 + number%10;

        System.out.printf("Сумма всех цифр числа %d равна %d\n", number, sum);
    }
}
