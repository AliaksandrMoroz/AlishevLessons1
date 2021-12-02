package Lesson_014_ClassObject;

public class Lesson14 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name="Alex";
        person.age=32;
        System.out.println("My name is "+ person.name+ ", "+ "my age "+ person.age);
        Person person2 = new Person();
        person2.name="Anna";
        person2.age=26;
        System.out.println("My name is "+ person2.name+ ", "+ "my age "+ person2.age);

    }
}
