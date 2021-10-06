public class Lesson17 {
    public static void main(String[] args) {
        PersonLesson17 personLesson17 = new PersonLesson17();
        personLesson17.setNameLesson17("Alex",32);
        personLesson17.sayHelloLesson17();
        personLesson17.speakLesson17();
        int year1 = personLesson17.calculateYearsBeforeRetirement();
        System.out.println("I'm up to retirement " + year1);
        System.out.println();

        PersonLesson17 personLesson17_2= new PersonLesson17();
        personLesson17_2.setNameLesson17("Anna",26);
        personLesson17_2.sayHelloLesson17();
        personLesson17_2.speakLesson17();
        int year2 = personLesson17_2.calculateYearsBeforeRetirement();
        System.out.println("I'm up to retirement " + year2);
    }
}
class PersonLesson17 {
    public void setNameLesson17(String name, int age) {
        this.name = name;
        this.age=age;
    }



    String name;
    int age;
    void speakLesson17(){
        System.out.println("My name is "+ name+ ", "+ "my age "+ age);
    }
    void sayHelloLesson17(){
        System.out.println("Hello");
    }
    int calculateYearsBeforeRetirement(){
        int years = 65-age;
        return years;
    }
}
