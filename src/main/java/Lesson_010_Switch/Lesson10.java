package Lesson_010_Switch;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("You entered case 1");
                break;
            case 2:
                System.out.println("You entered case 2");
                break;
            case 3:
                System.out.println("You entered case 3");
                break;
            default:
                System.out.println("You entered default value");
        }
    }
}
