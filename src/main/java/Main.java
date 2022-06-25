import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Test test = new Test();

        System.out.println("Hello Person, Please input information to get prayer times!");

        System.out.println("Please enter your Timezone ID (for example: EST,EMT, PST): ");
        String ID = scanner.nextLine();

        System.out.println("Please enter your locations latitude: ");
        double latitude = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter your locations longitude: ");
        double longitude = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter Month(##): ");
        int month = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter day(##): ");
        int day = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter Year(####): ");
        int year = Integer.parseInt(scanner.nextLine());
        test.testData(year, month, day, latitude, longitude, ID);


    }
}

