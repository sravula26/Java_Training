package first;



class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
   
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 10);
        System.out.println("Sum1: " + sum1);

        double sum2 = calculator.add(2.5, 3.7);
        System.out.println("Sum2: " + sum2);

        int sum3 = calculator.add(3, 7, 2);
        System.out.println("Sum3: " + sum3);
    }
}
