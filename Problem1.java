import java.util.HashSet;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem1 {
    public static void main(String[] args) {
        // Checking every value if divisible by 3 or 5
        // Optimize if
        System.out.println(IntStream.range(0, 1000).filter(val -> val % 3 == 0 || val % 5 == 0).sum());
    }
}