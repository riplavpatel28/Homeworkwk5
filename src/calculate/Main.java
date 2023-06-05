package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner declaration for reading input
        Scanner scanner = new Scanner(System.in);
        Calculator obj = new Calculator();
        char choice;
        do {
            System.out.println("Enter the first number:");
            int number1 = scanner.nextInt();
            System.out.println("Enter the second number");
            int number2 = scanner.nextInt();
            System.out.println("Please enter one of symbol+,-,*,/:");
            char symbol = scanner.next().charAt(0);
            obj.calculateResult(number1, number2, symbol);
            System.out.println("Would you like to do more calculation?Please enter y or n:");
            choice = scanner.next().charAt(0);
        }while(choice == 'y' || choice == 'y');
        scanner.close();
        System.out.println("Programme terminated");


        }





    }










