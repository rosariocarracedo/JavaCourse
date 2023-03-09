package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season: ");
        String season = scanner.next();
        System.out.println("Enter a number: ");
        int cups = scanner.nextInt();
        System.out.println("Enter an adjective: ");
        String adjective = scanner.next();

        System.out.println("On a day " + adjective + " " + season + " ,I drink a minimum " + cups + " of cups of coffee.");

    }
}
