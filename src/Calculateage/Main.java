package Calculateage;
import java.util.Calendar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Add your Date of Birth: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt() - 1;
        int day = scanner.nextInt();

        Calendar local = Calendar.getInstance();
        Calendar user = Calendar.getInstance();
        user.set(year, month, day);

        int age = local.get(Calendar.YEAR) - user.get(Calendar.YEAR);
        System.out.println(" Yor are " + age + " Years old");

        scanner.close();
    }

}
