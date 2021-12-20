import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(MyMap.mapping(Arrays.asList("1", "abc", "2", "3")));
        System.out.println(Flatting.flattingStrings(Arrays.asList("abc", "def", "ghj")));
        System.out.println(FizzBuzz.fizzBuzz(100));
        System.out.println(GroupWords.groupWords(Arrays.asList("ABCA", "BCD", "ABC")));
    }
}