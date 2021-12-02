package Lesson_020_021_Constructor_Static;

public class Lesson20_21 {
    public static void main(String[] args) {
    Woman woman=new Woman("Anna",26);
    Woman woman1=new Woman("Kira", 2);
    Woman.description="Nice";
    woman.getAllFields();
    woman.printCountWoman();
    woman1.printCountWoman();
    }
}
