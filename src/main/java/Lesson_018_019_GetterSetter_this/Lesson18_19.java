package Lesson_018_019_GetterSetter_this;

public class Lesson18_19 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setHumanName("Alex");
        human.setHumanAge(32);
        human.getInfo();
        Human human2 = new Human();
        human2.setHumanName("Anna");
        human2.setHumanAge(26);
        human2.getInfo();

    }
}
