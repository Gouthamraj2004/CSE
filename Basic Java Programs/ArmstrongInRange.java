import java.util.Scanner;

class ArmstrongInRange {
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int n = 0;

        while (originalNumber != 0) {
            originalNumber /= 10;
            n++;
        }
        originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, n);
            originalNumber /= 10;
        }
        return result == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int srt = scanner.nextInt();
        System.out.print("Enter the ending range: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + srt + " and " + end + " are:");

        for (int i = srt; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
