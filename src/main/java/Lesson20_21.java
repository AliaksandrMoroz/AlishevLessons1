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
class Woman{
    private String womanName;
    private int womanAge;
    private static int countWoman;
    public static String description;

    public Woman(){
        System.out.println("Hello first constructor");
    }
    public Woman(String name){
        System.out.println("Hello second constructor");
        this.womanName=name;
    }
    public Woman(String name,int age){
        System.out.println("Hello third constructor");
        this.womanName=name;
        this.womanAge=age;
        countWoman++;
    }
    public void getAllFields(){
        System.out.println(womanName+","+womanAge+","+description);
    }
    public void printCountWoman(){
        System.out.println(countWoman);

    }
}