package Lesson_035_AnonimClasses;

public class Test {
    public static void main(String[] args) {
    AbleToEat ableToEat=new AbleToEat() {
        @Override
        public void eat() {
            System.out.printf("Eating...");
        }
    };
    ableToEat.eat();
    }
}
