public class MethodsExercises {
    public static long getAddition (int num1, int num2) {
        return num1 + num2;
    }
    public static long getSubtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static long getMultiplication(long num1, long num2) {
        return num1 * num2;
    }
    public static long getDivision(long num1, long num2) {
        return num1 / num2;
    }
    public static void main(String[] args) {
        System.out.println(getAddition(1, 5));
        System.out.println(getSubtraction(1, 5));
        System.out.println(getMultiplication(1, 5));
        System.out.println(getDivision(1, 5));
    }

}
