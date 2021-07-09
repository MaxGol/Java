import java.util.Scanner;

public class UserInput {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth ");

        boolean isNextInt = scanner.hasNextInt();

        if (isNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            int  age = 2021 - yearOfBirth;

            System.out.println("Enter your name ");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Hello " + name + ", and you are " + age);
            } else {
                System.out.println("Age is not valid number");
            }
        } else {
            System.out.println("Age is not valid number");
        }

        scanner.close();
    }
}
