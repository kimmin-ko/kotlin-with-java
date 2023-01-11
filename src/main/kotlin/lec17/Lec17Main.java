package lec17;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lec17Main {

    public static void main(String[] args) {
        List<JavaFruit> fruits = List.of(
                new JavaFruit("사과", 1000),
                new JavaFruit("사과", 2000),
                new JavaFruit("사과", 3000),
                new JavaFruit("바나나", 4000),
                new JavaFruit("바나나", 5000),
                new JavaFruit("포도", 2000),
                new JavaFruit("포도", 3000),
                new JavaFruit("포도", 4000)
        );

        System.out.println(filterFruits(
                        fruits,
                        fruit -> Set.of("사과", "포도").contains(fruit.getName()) && fruit.getPrice() >= 3000
                )
        );
    }

    private static List<JavaFruit> filterFruits(List<JavaFruit> fruits, Predicate<JavaFruit> filter) {
        return fruits.stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

}
