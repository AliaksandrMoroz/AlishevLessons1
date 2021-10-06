public class Lesson16 {
    public static void main(String[] args) {
        PersonLesson16 personLesson16 = new PersonLesson16();
        personLesson16.name="Alex";
        personLesson16.age=32;
        personLesson16.sayHelloLesson16();
        personLesson16.speakLesson16();
        int year1 = personLesson16.calculateYearsBeforeRetirement();
        System.out.println("I'm up to retirement " + year1);
        System.out.println();

        PersonLesson16 personLesson16_2= new PersonLesson16();
        personLesson16_2.name="Anna";
        personLesson16_2.age=26;
        personLesson16_2.sayHelloLesson16();
        personLesson16_2.speakLesson16();
        int year2 = personLesson16_2.calculateYearsBeforeRetirement();
        System.out.println("I'm up to retirement " + year2);
    }
}
class PersonLesson16 {
    String name;
    int age;
    void speakLesson16(){
            System.out.println("My name is "+ name+ ", "+ "my age "+ age);
    }
    void sayHelloLesson16(){
        System.out.println("Hello");
    }
    int calculateYearsBeforeRetirement(){
        int years = 65-age;
        return years;
    }
}


