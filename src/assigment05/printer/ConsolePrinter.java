package assigment05.printer;

public class ConsolePrinter {

    /** Prints
     * @param message to system console */
    public static void print(String message) {
        System.out.println(message);
    }

    /** Prints
     * @param object to system console */
    public static void print(Object object) {
        System.out.println(object.toString());
    }
}
