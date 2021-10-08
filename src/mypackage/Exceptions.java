package mypackage;

public class Exceptions {
    public static void main(String[] args) {
        try {
            divide(10, 2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void divide(int a, int b) throws ArithmeticException {
        try {
            System.out.println("Result is: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Problem!");
        } finally {
            System.out.println("Finish!");
        }

        if(b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            System.out.println("Result is: " + a / b);
        }
    }
}
