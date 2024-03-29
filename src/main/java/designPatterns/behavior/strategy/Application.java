package designPatterns.behavior.strategy;

import designPatterns.behavior.strategy.algorithms.family.IStrategy;
import designPatterns.behavior.strategy.client.Context;

import java.util.Scanner;

/**
 * Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
 * The strategy lets the algorithm vary independently from clients that use it.
 * Why use the Strategy design pattern ?
 * An object must be able to vary part of its algorithm dynamically.
 * Results ?
 * The design pattern makes it possible to isolate the algorithms belonging to the same family of algorithms
 * Family of algorithm : it says that there’s a grouping of algorithms that may do the same kind of thing, the same theme but in a different way. For example: Imagine that we have a list of operations to perform on integers. You can add, subtract, multiply and divide. If we take all these operation algorithms, we have here a family of algorithms.
 * Separate class : that means that we have to encapsulate each one of these algorithms in a separate class. If we take the same example of operation, we have to separate the add, substract and multiplys in a différents classes. In every class we have only and one method that we can call doOperation()
 * Inerchangeable :  If a client application will use these algorithms, these algorithms will be interchangeable, ie during execution this application will use the first algorithm at another time it will use another algorithm of this same family. at any given time an application can change from one version to another. So how can we do that ? For that we have to create an interface to be open to extension closed to modification. This interface will be injected in the Client application
 * The last staement : at any given time, we can add a new class that implements the interface, that way you don't need to change anything in the client class. Why ? because in the client class we only depend on the interface. so the algorithm family can evolve independently of the client using them. The family algorithm here is scalable and this is the bigesst advantage of using this design pattern
 * Why use the Stragtegy design pattern? When you have an object which contains a method therefore which contains an algorithm of an operation to add for example which makes it possible to add two whole numbers. But during execution, I would like the behavior of the addition method to change to a subtraction. In this specific case, we must use the strategic design pattern. So the object is able to vary part of its algorithm dynamically.
 * Advantages :
 * 1- simplified unit testing, because each algorithm has its own class, can be tested by their own interface
 * 2- Making the system more flexible and easy to expand.
 * 3- adhere to most grasp principles and common design principles, high cohesion, low coupling.
 * Disadvantages:
 * 1- because each specific policy class will produce a new class, it will increase the number of classes the system needs to maintain.
 */

public class Application {
    private static final String PACKAGE_NAME = "designPatterns.behavior.strategy.algorithms.family.";

    public static void main(String[] args) throws Exception {
        Context context = new Context();

        System.out.println("---Bad habit---");
        context.process(1);
        context.process(2);
        context.process(3);


        System.out.println("\n\n---Good habit---");
        boolean end = false;
        Scanner scanner = new Scanner(System.in);
        while (!end) {
            System.out.print("Which strategy ?   ");
            String strategyClassName = scanner.nextLine();
            IStrategy strategy = (IStrategy) Class.forName(PACKAGE_NAME + strategyClassName).newInstance();
            context.setStrategy(strategy);
            context.process();
        }

    }
}
