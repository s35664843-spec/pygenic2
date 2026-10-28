public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum = add(a, b);
        int difference = subtract(a, b);
        int product = multiply(a, b);
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        int quotient = divide(a, b);
        System.out.println("The quotient is: " + quotient);
    }
}
