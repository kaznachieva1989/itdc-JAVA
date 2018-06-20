import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int number = a*45 + a/2*5 + (a-1)/2*15;
        int result1 = 9 + number/60;
        int result2 = number%60;

        System.out.printf("%d %d", result1,result2);
    }
}
