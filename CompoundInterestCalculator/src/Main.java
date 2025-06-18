import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // COMPOUND INTEREST CALCULATOR

        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the # of times compounded per year: ");
        timesCompound = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompound, timesCompound * years);

        System.out.printf("\nThe amount after %d year/s is: $%.2f", years, amount);

        scanner.close();
    }
}