package Lesson33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("Cat");
        animals.add("Pig");
        animals.add("Dog");

        String animal = (String) animals.get(1);
        System.out.println(animal);

        List<String> animals2 = new ArrayList<>();
        animals2.add("Cat");
        animals2.add("Pig");
        animals2.add("Dog");
        String animal2 = animals2.get(1);
    }
}
