public class Lesson25 {
    public static void main(String[] args) {
    Hero hero  = new Hero("Alex", 50);
        System.out.println(hero.toString());

    }
}
class Hero {
    private String name;
    private int level;

    public Hero(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}