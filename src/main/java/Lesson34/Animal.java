package Lesson34;

public class Animal {
    private int id;
    public Animal(){

    }
    public void eat(){
        System.out.println("Animal is eating...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }

    public Animal(int id) {
        this.id = id;
    }
}
