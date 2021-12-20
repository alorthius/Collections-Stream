import java.util.*;
import java.util.stream.Collectors;

public class GroupWords  {
    public static Map<Character, Long> groupWords(List<String> arr) {
        return arr.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue().stream()
                        .flatMap(y -> Arrays.stream(y.split(""))
                                .filter(z -> Objects.equals(z, String.valueOf(x.getKey())))).count()));
    }
}