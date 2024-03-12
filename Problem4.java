public class Problem4 {
    // Largest Palindrome Product

    // A palindromic number reads the same both ways. The largest palindrome made
    // from the
    // product of two 2-digit numbers is 9009 = 91*99

    // Find the largest palindrome made from the product of two 3-digit numbers

    // Notes:
    // - Largest number from the product of 3 digit numbers is
    // 999*999 = 1000 * 999 - 1000 = 998000
    // - brute force method comes to mind:
    // - find large palindromes less than 998000 and see if they are divisible by 3
    // digit numbers
    // - 997799, 996699, 995599, 994499, 993399, etc.
    // - seems like a loooooot of work :/
    // - A simpler way may be to find values of 999 * 999, 999 * 998, 999 * 997. We
    // could start from
    // the top and work our way down until we find a palindrome. that seems a bit
    // better.
    // - So what is the pattern of order? 999 * 999 > 999 * 998
    public static void main(String[] args) {
        // Test case: Should be 9009
        System.out.println(getLargestPalindromeForNDigitNumbers(2));
        System.out.println(getLargestPalindromeForNDigitNumbers(3));
    }

    public static int getLargestPalindromeForNDigitNumbers(int digits) {
        int largestNumber = getLargestNumberForNDigits(digits);
        int y = largestNumber;

        int largestPalindrome = -1;

        // find largest palindrome with y set at 99
        while (y * largestNumber > largestPalindrome) {
            int x = largestNumber;

            int product = x * y;

            // We will loop until the product is either:
            // - Not a palindrome
            // - Less than or equal to the largest palindrome
            while (!isPalindromic(product) && product > largestPalindrome) {
                product = --x * y;
            }
            if (isPalindromic(product)) {
                largestPalindrome = product;
            }
            y--;
        }

        return largestPalindrome;
    }

    private static int getLargestNumberForNDigits(int digits) {
        int base = (int) Math.pow(10, digits - 1);

        int sum = 0;
        while (base >= 1) {
            sum += base * 9;
            base /= 10;
        }
        return sum;
    }

    public static boolean isPalindromic(int test) {
        String testAsString = Integer.toString(test);
        for (int i = 0; i < testAsString.length() / 2; i++) {
            if (testAsString.charAt(i) != testAsString.charAt((testAsString.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}
