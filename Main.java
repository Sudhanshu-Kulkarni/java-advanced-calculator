// Name: Sudhanshu Kulkarni
// PRN: 23070126132
// Batch: B3

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object for user input

        Scanner scanner = new Scanner(System.in);
        // Initialize the Operations class to perform calculations

        Operations op = new Operations();
        boolean exit = false;

        System.out.println("===== Welcome to Java Calculator =====");

        // Loop until the user chooses to exit
        while (!exit) {
            // Display the list of available operations
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.println("5. Square\n6. Cube\n7. Square Root\n8. Exit");
            System.out.print("Enter your choice (1-8): ");

            int choice;

            try {
                // Read the user's input and convert it to an integer
                String choiceInput = scanner.next();
                choice = Integer.parseInt(choiceInput);
                // Validate the menu choice

                if (choice < 1 || choice > 8) {
                    throw new IllegalArgumentException("Invalid menu choice. Please choose between 1 and 8.");
                }
                // Declare variables for input numbers
                Double a = null, b = null;

                // Handle input based on the selected operation
                if (choice <= 4) {
                    System.out.print("Enter first number: ");
                    a = parseInput(scanner.next());

                    System.out.print("Enter second number: ");
                    b = parseInput(scanner.next());
                } else if (choice <= 7) {
                    System.out.print("Enter number: ");
                    a = parseInput(scanner.next());
                }

                // Perform the selected operation
                try {
                    double result = 0;

                    // Switch case for different operations
                    switch (choice) {
                        case 1:
                            result = op.add(a, b);
                            break;
                        case 2:
                            result = op.subtract(a, b);
                            break;
                        case 3:
                            result = op.multiply(a, b);
                            break;
                        case 4:
                            result = op.divide(a, b);
                            break;
                        case 5:
                            result = op.square(a);
                            break;
                        case 6:
                            result = op.cube(a);
                            break;
                        case 7:
                            result = op.squareRoot(a);
                            break;
                        case 8:
                            exit = true;
                            System.out.println("Exiting the calculator. Goodbye!");
                            continue;
                    }

                    // Display the result of the operation
                    System.out.println("Result: " + result);

                    // Handle arithmetic or invalid argument errors

                } catch (ArithmeticException | IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                    // Handle any other unexpected errors
                } catch (Exception e) {
                    System.out.println("Unexpected Error: " + e.getMessage());
                    // Display a message after completing the operation
                } finally {
                    System.out.println("--- Operation Completed ---");
                }

                // Handle invalid menu input (non-integer)
            } catch (NumberFormatException e) {
                System.out.println("Invalid menu input. Please enter a number between 1 and 8.");
                scanner.nextLine(); // clear buffer
                // Handle invalid number input
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scanner.nextLine(); // clear buffer
                // Handle invalid argument errors
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                // Handle any other unexpected errors
            } catch (Exception e) {
                System.out.println("Unexpected Error in main: " + e.getMessage());
            }
        }

        // Close the scanner object to free up resources
        scanner.close();
    }

    // Helper method for input parsing and null/NaN checks
    private static Double parseInput(String input) {
        // Check if the input is null or empty

        if (input == null || input.isBlank()) {
            throw new InputMismatchException("Input cannot be empty.");
        }

        try {
            // Parse the input to a Double
            Double value = Double.parseDouble(input);
            // Check if the input value is NaN (Not-a-Number)
            if (value.isNaN()) {
                throw new InputMismatchException("Input is NaN (not a number).");
            }
            return value;
        } catch (NumberFormatException e) {
            // Handle invalid number format
            throw new InputMismatchException("Invalid number format.");
        }
    }
}
