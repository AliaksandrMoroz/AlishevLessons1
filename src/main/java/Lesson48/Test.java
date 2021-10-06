package Lesson48;

public class Test {
    public static void main(String[] args) {
        Animal animal= Animal.CAT;
        System.out.println(animal);

        switch (animal){
            case CAT:
                System.out.println("It's a cat!");
                break;
            case DOG:
                System.out.println("It's a dog!");
                break;
            case PIG:
                System.out.println("It's a pig!");
                break;
            default:
                System.out.println("It's not a animal!");
        }

        Season season= Season.AUTUMN;
        System.out.println(season.getTemperature());

        switch (season){
            case WINTER:
                System.out.println("It's cold outside!");
                break;
            case SUMMER:
                System.out.println("It's warm outside!");
        }
    }
}
