import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int h = number/60/60%24;
        int m = number/60%60;
        int s = number%60;
        System.out.printf("%d:%02d:%02d\n", h,m,s);
    }
}
