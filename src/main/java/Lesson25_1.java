public class Lesson25_1 {
    public static void main(String[] args) {
    Dog dog= new Dog();
    dog.eat();
    dog.ShowName();

    }
}
    class Animal{
    String name= "Some name";
        public void eat(){
        System.out.println("I am eating...");
    }
        public void sleep(){
    System.out.println("I am sleeping...");
}
}
    class Dog extends Animal{
        public void eat(){
        System.out.println("Dog s eating...");
    }
        public  void bark(){
        System.out.println("I am barking...");
    }
    public void ShowName(){
        System.out.println(name);
    }
}
