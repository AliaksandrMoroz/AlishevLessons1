public class Lesson14 {
    public static void main(String[] args) {
        PersonLesson14 personLesson14_1 = new PersonLesson14();
        personLesson14_1.name="Alex";
        personLesson14_1.age=32;
        System.out.println("My name is "+ personLesson14_1.name+ ", "+ "my age "+ personLesson14_1.age);
        PersonLesson14 personLesson14_2 = new PersonLesson14();
        personLesson14_2.name="Anna";
        personLesson14_2.age=26;
        System.out.println("My name is "+ personLesson14_2.name+ ", "+ "my age "+ personLesson14_2.age);

    }
}
class PersonLesson14 {
    String name;
    int age;
}