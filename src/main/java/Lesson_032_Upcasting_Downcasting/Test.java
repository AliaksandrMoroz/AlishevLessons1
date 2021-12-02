package Lesson_032_Upcasting_Downcasting;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog= (Dog) animal;
        animal.eat();

    }

}
