package Lesson39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        File file= new File("text");
        try (Scanner scanner = new Scanner(file)) {    //
        } catch (FileNotFoundException e) {            // Check exception;
            e.printStackTrace();                       //
        }

        int x = 1/0;                                   //
        int[] arr=new int[2];                          //UnCheck exception;
        System.out.println(arr[2]);                    //
    }
}
