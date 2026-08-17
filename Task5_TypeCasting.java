public class Task5_TypeCasting {
    public static void main(String[] args) {
        // Implicit casting: int is automatically converted to double.
        int integerValue = 25;
        double implicitValue = integerValue;

        // Explicit casting: double is manually converted to int.
        double decimalValue = 45.78;
        int explicitValue = (int) decimalValue;

        System.out.println("----- Type Casting -----");
        System.out.println("Implicit Casting:");
        System.out.println("Before : int = " + integerValue);
        System.out.println("After  : double = " + implicitValue);

        System.out.println("\nExplicit Casting:");
        System.out.println("Before : double = " + decimalValue);
        System.out.println("After  : int = " + explicitValue);
    }
}
