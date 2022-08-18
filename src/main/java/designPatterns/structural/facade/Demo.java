package designPatterns.structural.facade;

/**
 * Facade pattern hides the complexities of the system and provides an interface
 * to the client using which the client can access the system.
 * This type of design pattern comes under structural pattern as this pattern adds
 * an interface to existing system to hide its complexities.
 * This pattern involves a single class which provides simplified methods required
 * by client and delegates calls to methods of existing system classes.
 */
public class Demo {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();    // Circle::draw()
        shapeFacade.drawRectangle(); //Rectangle::draw()
        shapeFacade.drawSquare();    //Square::draw()
    }
}
