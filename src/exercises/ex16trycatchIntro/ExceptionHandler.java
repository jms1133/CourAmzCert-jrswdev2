package exercises.ex16trycatchIntro;

public class ExceptionHandler {
    public static void main(String[] args) {
        /*try {
            int[] numbers = new int[5];
            numbers[5] = 10 / 0;
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }*/

        try {
            int[] array = {10, 20, 30, 40, 50};
            System.out.println(array[5]);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In the finally block!");
        }

        System.out.println("More code");
    }
}