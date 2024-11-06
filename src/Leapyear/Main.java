package Leapyear;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a year!!");
        int Year = scanner.nextInt();
        System.out.println("The year you provided it: " + Year);

        if ( Year % 4 == 0 && Year % 100 != 0){
            System.out.println(" it leap year ");
        } else if (Year % 400 == 0) {
            System.out.println(" Still a leap year ");
        }
        else {
            System.out.println(" Not a leap year ");
        }
        scanner.close();
    }
}
