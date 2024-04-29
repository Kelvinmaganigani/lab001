import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    private double num1, num2;
    private Scanner scanner;
    public String next;

    private void printMenu() {
        System.out.println("Choose an operation:");
        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit");
    }

    private int readChoice() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        scanner = new Scanner(System.in);
        int choice = 0;

        
        try {
            System.out.print("Select (1-5): ");
            choice = Integer.parseInt(br.readLine());

            if (choice < 1 || choice > 5) { throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 5.");}
        } 
        catch (java.util.InputMismatchException e) { System.out.println("Invalid input. Please enter a valid integer."); scanner.nextLine(); choice = readChoice();} 
        catch (IllegalArgumentException e) { System.out.println(e.getMessage()); choice = readChoice(); } 
        

        return choice;
    }

    private void readInput() throws IOException{
        scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the first number: ");
            this.num1 = Integer.parseInt(br.readLine());

            System.out.print("Enter the second number: ");
            this.num2 = Integer.parseInt(br.readLine());
        } 
        catch (java.util.InputMismatchException e) { System.out.println("Invalid input. Please enter a valid number."); scanner.nextLine(); readInput();} 
        catch (IllegalArgumentException e) { System.out.println(e.getMessage()); } 
        catch (Exception e) { System.out.println(e.getMessage()); }
        
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

    public boolean next_calculation() throws IOException{
        boolean repeate = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Do another calculation? (yes/no): ");
            this.next = br.readLine().toLowerCase().trim();
            if (next.equals("yes")) { repeate = true;}
            else if (next.equals("no")) { System.out.println("Thank you for using the Basic Calculator!"); repeate = false;}
            else { System.out.println("Please enter yes/no..."); next_calculation(); }
        }catch (Exception e) { System.out.println(e.getMessage());  repeate = false; }
        
        return repeate;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        Main calculator = new Main();
        boolean repeat = true;

        do {
            calculator.printMenu();
            int choice = calculator.readChoice();

            if (choice < 1 || choice > 5) { System.out.println("Please enter a valid choice (1-5)."); continue; }

            else if (choice == 5) { System.out.println("Exiting the Basic Calculator!"); break; }

            calculator.readInput();
            double result = calculator.performOperation(choice);
            calculator.printResult(result);

            repeat = calculator.next_calculation();
        } while (repeat);

        scanner.close();
    }
}
