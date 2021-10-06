package Lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= Integer.parseInt(String.valueOf(numbersString[i]));
        }
        System.out.println(Arrays.toString(numbers));


    }
}
