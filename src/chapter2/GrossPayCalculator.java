package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        //1 we'd get the number of hours worked.
        System.out.println("Number of hours worked");
        Scanner scanner =new Scanner(System.in);
        int hours = scanner.nextInt();

        //2 we get the hourly pay rate.
        System.out.println("Pay rate");
        double rate = scanner.nextDouble();

        //3 we multiply the hours and the pay rate.
        double grossPay = hours * rate;

        //4 we would display the result.
        System.out.println("Gross pay: " + grossPay);
    }
}
