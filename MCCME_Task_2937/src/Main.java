import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int sum = number + 1;
            int sub = number - 1;

            System.out.printf("The next number for the number %d is %d.\n", number, sum);
            System.out.printf("The previous number for the number %d is %d.\n", number, sub);

        }
}
