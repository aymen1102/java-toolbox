package general.serialization;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String lastname;
    private int age;
    private String maritalStatus;

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
