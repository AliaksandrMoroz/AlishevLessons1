import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int value;
        do{
            System.out.println("Enter five");
            value=scanner.nextInt();
        }while (value!=5);
        System.out.println("You entered five.");
    }
}
