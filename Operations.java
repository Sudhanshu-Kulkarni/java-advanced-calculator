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
}
