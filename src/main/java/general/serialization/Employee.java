package general.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String lastname;
    private int age;
    private String maritalStatus;

    public Employee(String name, String lastname, int age, String maritalStatus) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }
}
