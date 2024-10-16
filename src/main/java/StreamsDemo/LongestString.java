package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LongestString {

    public static void main(String[] args){

        String[] stringArray = {"Nagoor", "Vali", "Shaik"};
        List<String> stringList = Arrays.asList(stringArray);

        Stream<String> stringStream = Arrays.stream(stringArray);



    }
}
