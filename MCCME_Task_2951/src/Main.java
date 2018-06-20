import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int rub = (a * c) + (b * c) /100;
        int kop = b * c%100;
        System.out.printf("%d %d", rub, kop);


    }
}
