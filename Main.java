import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Compound Interest Calculator");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Please enter rate of Interest: ");
        double roi = sc.nextDouble();
        System.out.print("Please enter number of years: ");
        double years = sc.nextDouble();

        double amount = principal * Math.pow((1 + roi / 100), years);
        double compoundInterest = amount - principal;

        System.out.printf("Your Compound Interest is ₹%.2f%n", compoundInterest);
    }
}
