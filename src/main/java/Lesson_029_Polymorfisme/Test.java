package Lesson_029_Polymorfisme;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Cat cat = new Cat();
        Dog dog= new Dog();
        test(animal);
        test(dog);
        test(cat);

//        String str="!!!";
//        str+="d";
//        System.out.println(str);
    }
    public static void test(Animal animal){
        animal.eat();
    }
}
