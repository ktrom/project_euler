public class Problem5 {
    // 2520 is the smallest number that can be divided by each of
    // the numbers 1-10 without any remainder.

    // What is the smallest positive number that is evenly divisible
    // by all of the numbers from 1-20?

    // Thoughts:
    // - anything divisible by a multiple is divisible by its factors
    // - so anything divisible by 6 or 9 is divisible by 3
    // - multiplication seems like a decent path to take
    // - 9 * 6 = 54 which is also divisible by 3
    // - obviously multiply by a number to get it as a factor
    // - note that multiplying two numbers doesn't always get its least common
    // multiple
    // - e.g. 4 * 6 = 24 but 4 and 6 share 12 as a multiple
    // - but why?
    // - 4 has factors 1, 2, and 4
    // - 6 has factors 1, 2, 3, and 6
    // - We can multiply 4 by 2 to get 8 and 4 by 3 to get 12
    // - 8 has factors 1, 2, 4, and 8
    // - 12 has factors 1, 2, 3, 4, 6, and 12

    public static void main(String[] args) {

    }
}
