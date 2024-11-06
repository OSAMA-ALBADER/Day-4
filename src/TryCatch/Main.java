package TryCatch;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Username = "OsAm";
        String Password = "OS123";
        try {
            System.out.println(" Username: ");
        String name = scanner.nextLine();
            System.out.println("Password:");
        String pass = scanner.nextLine();
        if (!(Username.equals(name) && Password.equals(pass))){
            throw new Exception("Invalid credentials");
        }
            System.out.println("you are valid");
        }
        catch ( Exception e ){
            System.out.println( e.getMessage());
        }
            scanner.close();
    }
}
