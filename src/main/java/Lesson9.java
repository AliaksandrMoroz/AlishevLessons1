public class Lesson9 {
    public static void main(String[] args) {
        int value=1;
        while (true){
            if(value==11){
                break;
            }
            System.out.print(value++ +" ");
        }
        System.out.println();
        for (int i = 0; i < value; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print("i="+i+" ");
        }
    }
}
