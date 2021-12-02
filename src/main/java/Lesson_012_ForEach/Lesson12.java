package Lesson_012_ForEach;

public class Lesson12 {
    public static void main(String[] args) {
        String [] strings = new String[4];
        strings[0]="Hello";
        strings[1]="java";
        strings[2]="world";
        strings[3]="!";
        for (String el:
             strings) {
            System.out.print(el+" ");
        }
        System.out.println();
        int[] numbers={1,2,3,4,5,6,7,8};
        int sum=0;
        for (int el:
             numbers) {
            System.out.print((sum+=el) +" ");
        }
    }
}
