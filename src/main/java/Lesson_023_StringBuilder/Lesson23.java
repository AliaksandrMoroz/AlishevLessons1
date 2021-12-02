package Lesson_023_StringBuilder;

public class Lesson23 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello  ");
        System.out.println(sb.toString());
        sb.append("my ").append("friend").append("!");
        System.out.println(sb.toString());
    }
}
