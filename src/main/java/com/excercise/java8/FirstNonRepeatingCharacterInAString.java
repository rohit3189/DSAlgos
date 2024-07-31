package com.excercise.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterInAString {

    public static void main(String[] args) {

        String input = "Java articles are Awesome";

        input.chars().mapToObj(Int -> Character.toLowerCase((char) Int))
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
             .entrySet()
             .stream()
             .filter(e -> e.getValue() == 1)
             .map(Map.Entry::getKey)
             .findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("No unique character found"));

    }
}
