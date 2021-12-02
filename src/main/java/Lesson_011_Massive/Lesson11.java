package Lesson_011_Massive;

public class Lesson11 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i*10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
    }
}
