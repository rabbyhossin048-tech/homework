
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = input.nextInt();

        System.out.print("Enter minutes: ");
        int m = input.nextInt();

        System.out.print("Enter seconds: ");
        int s = input.nextInt();

        s++;

        if (s == 60) {
            s = 0;
            m++;
        }

        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24) {
            h = 0;
        }

        System.out.printf("Time one second later: %02d:%02d:%02d%n",
                          h, m, s);

        input.close();
    }
}
