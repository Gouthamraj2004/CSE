import java.util.Scanner;

class Leapyearornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a Leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        scanner.close();
    }
}