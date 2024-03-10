public class Problem2 {
    public static void main(String[] args) {
        testLessThan90();
        testLessThan5();
        System.out.println(getSumOfEvenFibonacciNumbers(4_000_000));
    }

    public static void testLessThan5() {
        int sum = getSumOfEvenFibonacciNumbers(5);
        int expectedSum = 2;
        System.out.println("testLessThan5 " + (sum == expectedSum ? "passed" : "failed"));
    }

    public static void testLessThan90() {
        int sum = getSumOfEvenFibonacciNumbers(90);
        int expectedSum = 2 + 8 + 34;
        System.out.println("testLessThan90 " + (sum == expectedSum ? "passed" : "failed"));
    }

    public static int getSumOfEvenFibonacciNumbers(int limit) {
        int[] lastThreeFibonnaciNumbers = new int[] { 1, 2, 3 };
        int sum = 2;

        while (lastThreeFibonnaciNumbers[2] < limit) {
            if (lastThreeFibonnaciNumbers[2] % 2 == 0) {
                sum += lastThreeFibonnaciNumbers[2];
            }

            lastThreeFibonnaciNumbers[0] = lastThreeFibonnaciNumbers[1];
            lastThreeFibonnaciNumbers[1] = lastThreeFibonnaciNumbers[2];
            lastThreeFibonnaciNumbers[2] = lastThreeFibonnaciNumbers[0] + lastThreeFibonnaciNumbers[1];
        }
        return sum;
    }

}
