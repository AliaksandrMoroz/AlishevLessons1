public class Lesson18_19 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setHumanName("Alex");
        human.setHumanAge(32);
        human.getInfo();
        Human human2 = new Human();
        human2.setHumanName("Anna");
        human2.setHumanAge(26);
        human2.getInfo();

    }
}
class Human{
    private String humanName;
    private int humanAge;

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        if(humanName.isEmpty()){
            System.out.println("error");
        }else {
            this.humanName = humanName;
        }}

    public int getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(int humanAge) {
        if(humanAge<0){
            System.out.println("error");
        }else{
        this.humanAge = humanAge;
    }}
    void getInfo(){
        System.out.println(humanName+ " " + humanAge);
    }
}