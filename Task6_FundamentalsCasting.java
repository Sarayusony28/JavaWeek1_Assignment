import java.util.Scanner;

public class Task6_FundamentalsCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int integerValue = scanner.nextInt();

        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Implicit widening conversions happen automatically.
        double integerToDouble = integerValue;
        double floatToDouble = floatValue;

        // Explicit narrowing conversion requires a cast.
        int doubleToInteger = (int) doubleValue;
        int floatToInteger = (int) floatValue;

        System.out.println("\n----- Values Before and After Casting -----");
        System.out.println("Integer value      : " + integerValue);
        System.out.println("Float value        : " + floatValue);
        System.out.println("Double value       : " + doubleValue);
        System.out.println("\nImplicit Casting:");
        System.out.println("int -> double      : " + integerToDouble);
        System.out.println("float -> double     : " + floatToDouble);
        System.out.println("\nExplicit Casting:");
        System.out.println("double -> int      : " + doubleToInteger);
        System.out.println("float -> int       : " + floatToInteger);

        scanner.close();
    }
}
