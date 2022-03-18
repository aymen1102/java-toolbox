package java8.methodreference;

public class MethodReferenceExamples {

    public static void saySomething(){

        System.out.println("Hello, this is static method ! ");

    }

    public static void threadStatus(){

        System.out.println("Thread is running...");

    }

    public static void main(String[] args) {
        //Exemple 1
        Sayable sayable = MethodReferenceExamples::saySomething;
        sayable.say();

        //Exemple 2
        Thread thread = new Thread(MethodReferenceExamples::threadStatus);
        thread.start();
    }

}
