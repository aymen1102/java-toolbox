package bestPractices.best_practice_3;

/** Class Members must be accessed privately
 * It is considered a java best practice to keep the accessibility of class fields as inaccessible as possible.
 * It is done to protect the fields. To achieve that, private access modifier is the ideal choice.
 * This practice is recommended to maintain the encapsulation, one of the fundamental concepts of OOP.
 * Although it is an extremely basic concept of object-oriented programming,
 * many new developers are aware of it but still do not properly assign access modifiers to the classes and prefer to keep it public for their ease.
 * */
public class BestPractice3 {
    public static void main(String[] args) {
        /** bad habit */
        TeacherPublic teacherPublic = new TeacherPublic();
        teacherPublic.name = "Laurent";
        teacherPublic.subject = "English";

        /** best practice */
        TeacherPrivate teacherPrivate = new TeacherPrivate();
        teacherPrivate.setName("Laurent");
        teacherPrivate.setSubject("English");
    }
}


class TeacherPrivate {
    private String name;
    private String subject;
    public void setName(String name) {
        this.name = name;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }
}

class TeacherPublic {
    public String name;
    public String subject;
    public void setName(String name) {
        this.name = name;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }
}
