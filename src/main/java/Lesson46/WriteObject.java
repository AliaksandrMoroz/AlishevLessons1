package Lesson46;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
      Person[] people= {new Person(1,"Bob"), new Person(2, "Alex"), new Person(3, "Anna")};

        try{
        FileOutputStream fos = new FileOutputStream("people1.bin");
        ObjectOutputStream  oos= new ObjectOutputStream(fos);

        oos.writeObject(people);


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
