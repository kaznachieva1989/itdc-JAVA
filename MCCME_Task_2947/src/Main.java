import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = number/60%24;
        int b = number%60;
        System.out.printf("%d %d\n", a,b);
    }
}
