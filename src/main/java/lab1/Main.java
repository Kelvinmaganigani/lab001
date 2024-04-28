import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    private double num1, num2;
    private Scanner scanner;

    private void printMenu() {
        System.out.println("Choose an operation:");
        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit");
    }

    private int readChoice() {
        scanner = new Scanner(System.in);
        int choice = 0;

        try {
            System.out.print("Select (1-5): ");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 5.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            // Clear the input buffer
            scanner.nextLine();
            // Call readChoice recursively to try again
            choice = readChoice();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            // Call readChoice recursively to try again
            choice = readChoice();
        } finally {
            // Always close the scanner to avoid resource leaks
            scanner.close();
        }

        return choice;
    }

    private void readInput() {
        scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            this.num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            this.num2 = scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            // Clear the input buffer
            scanner.nextLine();
            // Call readInput recursively to try again
            readInput();
        } finally {
            // Always close the scanner to avoid resource leaks
            scanner.close();
        }
    }

    private double performOperation(int choice) {
        BasicCalculator calc = new BasicCalculator();
        double result = 0;
        switch (choice) {
            case 1: result = calc.add(num1, num2);
                break;
            case 2: result = calc.subtract(num1, num2);
                break;
            case 3: result = calc.multiply(num1, num2);
                break;
            case 4:
                if (num2 != 0) { result = calc.divide(num1, num2);} 
                else { System.out.println("Cannot divide by zero.");}
                break;
        }
        return result;
    }

    private void printResult(double result) {
        DecimalFormat df = new DecimalFormat("0.0######");
        System.out.println("Result: " + df.format(result));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main calculator = new Main();
        boolean repeat = true;

        do {
            calculator.printMenu();
            int choice = calculator.readChoice();

            if (choice < 1 || choice > 5) { System.out.println("Please enter a valid choice (1-5)."); continue; }

            if (choice == 5) { System.out.println("Exiting the Basic Calculator!"); break; }

            calculator.readInput();
            double result = calculator.performOperation(choice);
            calculator.printResult(result);

            Scanner din = new Scanner(System.in);
            System.out.print("Do another calculation? (yes/no): ");
            String userInput;
            if (din.hasNextLine()) { userInput = din.nextLine().toLowerCase().trim(); }
            else { System.out.println("No input found. Exiting Basic Calculator..."); userInput = din.nextLine().toLowerCase(); repeat = false; break;}

            if (userInput.equals("no")) {
                repeat = false;
                System.out.println("Thank you for using the Basic Calculator!");
            } else if (!userInput.equals("yes")) {
                System.out.println("Invalid input. Exiting the Basic Calculator.");
                repeat = false;
            }
        } while (repeat);

        scanner.close();
    }
}
