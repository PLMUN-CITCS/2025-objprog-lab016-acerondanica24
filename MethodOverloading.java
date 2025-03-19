public class MethodOverloading {
    public static void main(String[] args) {
        // Call the overloaded printValue methods
        printValue(10);
        printValue(3.14);
        printValue("Hello!");
    }

    // Overloaded method for integer
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Overloaded method for double
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Overloaded method for string
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
