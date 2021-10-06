package Lesson47;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -2106817634918380083L;

    private int id;
    private transient String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
