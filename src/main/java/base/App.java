package base;

import java.util.Scanner;
import java.text.DecimalFormat;
public class App {
    public static void main(String[] args) {
        double principal, interest, years;
        int a = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        principal = input.nextDouble();
        System.out.println("Enter the rate of interest: ");
        interest = input.nextDouble();
        System.out.println("Enter the number of years: ");
        years = input.nextDouble();
        double trueyear = years/100;
        DecimalFormat formatter = new DecimalFormat("#0.00");
        double simp = principal * (a + (interest * trueyear));
        System.out.println("After " + years + " years at " + interest + "%, the investment will be worth $" + formatter.format(simp) + ".");
    }

}
