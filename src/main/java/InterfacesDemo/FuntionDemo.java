package InterfacesDemo;

import java.util.function.Function;

public class FuntionDemo {

    public static void main(String[] args){

        String inputString = "Code Buff";

        Function<String, Integer> lengthOfString = str -> str.length();

        System.out.println(lengthOfString.apply(inputString));

    }
}
