import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    private static Object fizzBuzzUtil(int x) {
        if (x % 15 == 0) {
            return "Fizz Buzz";
        }
        if (x % 3 == 0) {
            return "Fizz";
        }
        if (x % 5 == 0) {
            return "Buzz";
        }
        return x;
    }

    public static List<Object> fizzBuzz(int n) {
        return IntStream.range(1, n + 1).mapToObj(FizzBuzz::fizzBuzzUtil).collect(Collectors.toList());
    }
}