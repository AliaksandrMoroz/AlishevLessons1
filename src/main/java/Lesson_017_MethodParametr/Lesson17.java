package Lesson_017_MethodParametr;

public class Lesson17 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setNameLesson("Alex",32);
        person.sayHelloLesson();
        person.speakLesson();
        int year1 = person.calculateYearsBeforeRetirement();
        System.out.println("I'm up to retirement " + year1);
        System.out.println();

        Person person_2 = new Person();
        person_2.setNameLesson("Anna",26);
        person_2.sayHelloLesson();
        person_2.speakLesson();
        int year2 = person_2.calculateYearsBeforeRetirement();
        System.out.println("I'm up to retirement " + year2);
    }
}

