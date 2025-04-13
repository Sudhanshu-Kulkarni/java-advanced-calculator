public class Operations {

    public double add(Double a, Double b) {
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for addition.");
        }
        return a + b;
    }

    public double subtract(Double a, Double b) {
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for subtraction.");
        }
        return a - b;
    }

    public double multiply(Double a, Double b) {
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for multiplication.");
        }
        return a * b;
    }

    public double divide(Double a, Double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for division.");
        }
        return a / b;
    }

    public double square(Double a) {
        return a * a;
    }

    public double cube(Double a) {
        return a * a * a;
    }
}
