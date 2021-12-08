import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
List<String> strings = new ArrayList<>();
strings.add("Amar");
strings.add("Aness");
strings.add("anessss");
List<String> testStream = strings.stream().filter(objects -> objects.contains("es")).collect(Collectors.toList());

        System.out.println(testStream);
        for (String e: testStream) {
            System.out.println(e);
        }
    }
}
