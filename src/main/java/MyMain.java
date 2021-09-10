import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int product=1;
        while (x>0) {
            product=product*x;
            x--;
        }
        return product;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e=0;
        int x=0;
        while (Math.abs(e-(Math.E))>0.00001) {
            e = e + (1/factorial(x));
            x++;
        }
        return e;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double guess=x/2;
        double betterGuess= guess+1;
        boolean close=false;
        while (!close) {
            betterGuess=(guess + x/guess) / 2;
            close = (Math.abs(guess-betterGuess)<0.00001);
            guess=betterGuess;
        }
        return betterGuess;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE
        System.out.println("enter a positive number");
        double num = scan.nextDouble();
        System.out.println("the square root of " + num + "is " + babylonian(num));
        System.out.println("The value of e is roughly " + calculateE());

        

        scan.close();
    }
}
