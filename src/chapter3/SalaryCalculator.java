package chapter3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;

        switch (grade) {
            case "A":
                message = "Excellent";
                break;
            case "B":
                message = "Great";
                break;
            default:
                message = "Que dices";
        }
        System.out.println(message);


    }
}