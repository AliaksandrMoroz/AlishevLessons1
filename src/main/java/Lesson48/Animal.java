package Lesson48;

public enum Animal {
    DOG("Собака"), CAT("Кот"), PIG("Свинья");
    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }
}
