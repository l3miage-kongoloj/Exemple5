package epsi;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        int result = compute(args);
        System.out.println("The result of add is : " + result);

        result = computeMult(args);
        System.out.println("The result of mult is : " + result);

    }

    public static int compute( String[] args) {
        return new CalculatorService().add(Arrays.asList(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }
    public static int computeMult( String[] args) {
        return new CalculatorService().multiplication(Arrays.asList(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }
}
