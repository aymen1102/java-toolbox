package java11.typeInference.lambdaTypeInferance;

import java.util.Arrays;
import java.util.List;

public class LambdaLocalVariableExample {

    public static void main(String[] args) {
        List<String> programmingLanguages = Arrays.asList("Java","Javascript","Python");
        programmingLanguages.stream()
                .map((var x)-> x.toUpperCase())
                .forEach(System.out::println);   //JAVA     JAVASCRIPT      PYTHON
    }
}
