public class Lesson15 {
    public static void main(String[] args) {
                PersonLesson15 personLesson15_1 = new PersonLesson15();
                personLesson15_1.name="Alex";
                personLesson15_1.age=32;
                personLesson15_1.speakLesson15();
                personLesson15_1.sayHelloLesson15();
                PersonLesson15 personLesson15_2= new PersonLesson15();
                personLesson15_2.name="Anna";
                personLesson15_2.age=26;
                personLesson15_2.speakLesson15();
                personLesson15_2.sayHelloLesson15();
     }
}
class PersonLesson15 {
            String name;
            int age;
            void speakLesson15(){
                for (int i = 0; i < 3; i++) {
                    System.out.println("My name is "+ name+ ", "+ "my age "+ age);
                }
            }
            void sayHelloLesson15(){
                System.out.println("Hello");
            }
}


