package Lesson_016_TypeMethodBack;

public class Lesson16 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name="Alex";
        person.age=32;
        person.sayHelloLesson();
        person.speakLesson();
        int year1 = person.calculateYearsBeforeRetirement();
        System.out.println("I'm up to retirement " + year1);
        System.out.println();

        Person person_2 = new Person();
        person_2.name="Anna";
        person_2.age=26;
        person_2.sayHelloLesson();
        person_2.speakLesson();
        int year2 = person_2.calculateYearsBeforeRetirement();
        System.out.println("I'm up to retirement " + year2);
    }
}



