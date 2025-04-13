public class Operations {

    // Method for addition of two numbers with input validation
    public double add(Double a, Double b) {
        // Check if either number is too large for the operation
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for addition.");
        }
        return a + b;
    }

    // Method for subtraction of two numbers with input validation
    public double subtract(Double a, Double b) {
        // Check if either number is too large for the operation
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for subtraction.");
        }
        return a - b;
    }

    // Method for multiplication of two numbers with input validation
    public double multiply(Double a, Double b) {
        // Check if either number is too large for the operation
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for multiplication.");
        }
        return a * b;
    }

    // Method for division of two numbers with input validation
    public double divide(Double a, Double b) {
        // Check for division by 0
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        // Check if either number is too large for the operation
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for division.");
        }
        return a / b;
    }

    // Method for square of a number
    public double square(Double a) {
        return a * a;
    }

    // Method for cube of a number
    public double cube(Double a) {
        return a * a * a;
    }

    // Method for square root of a number with input validation
    public double squareRoot(Double a) {
        // Check if number is negative
        if (a < 0) {
            throw new ArithmeticException("Cannot take the square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}
