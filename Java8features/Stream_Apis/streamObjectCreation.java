package Java8features.Stream_Apis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamObjectCreation {
    public static void main(String[] args) {

        //1.. For Collection

        List<String> list = Arrays.asList("Java", "Python", "C++");

        Stream<String> stream1 = list.stream();

        //2.. For Array

        String[] arr = { "Java", "Python", "C++" };

        Stream<String> stream2 = Arrays.stream(arr);


        //3.. Using Stream.of()

        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);

        //4.. Using builder
        Stream<Object> streamBuilder=Stream.builder().build();

        

    }
}
