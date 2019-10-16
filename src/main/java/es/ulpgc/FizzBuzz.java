package es.ulpgc;

public class FizzBuzz {

    public static String of(int number) {
        return (checkSpecialNumber(number)) ? checkFizzBuzz(number) : String.valueOf(number);
    }

    private static boolean checkSpecialNumber(int number) {
        return multipleOfThree(number) || multipleOfFive(number);
    }

    private static String checkFizzBuzz(int number) {
        return (multipleOfThree(number) ? "Fizz" : "") + (multipleOfFive(number) ? "Buzz" : "");
    }

    private static boolean multipleOfFive(int number) {
        return number % 5 == 0;
    }

    private static boolean multipleOfThree(int number) {
        return number % 3 == 0;
    }
}
