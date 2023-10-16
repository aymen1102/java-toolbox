package solid.dependencyInversion;

/**
 * In this example, we demonstrate Dependency Injection (DI) in Java. Dependency Injection is a design pattern that allows you to inject dependencies
 * (such as services) into a class rather than having the class create them itself. This promotes loose coupling and makes the code more maintainable and testable.
 * We have a MessageService interface representing a service that can send messages.
 * Two classes, EmailService and SMSService, implement the MessageService interface, providing different implementations for sending emails and SMS.
 * The MessageProcessor class depends on a MessageService to send notifications.
 * It accepts a MessageService through its constructor, demonstrating constructor-based dependency injection.
 * In the main method, we create instances of the services and inject them into instances of MessageProcessor.
 * This allows us to send notifications using different services without changing the MessageProcessor class.
 * Dependency Injection helps decouple components, making the code more flexible and facilitating testing
 * by allowing you to easily substitute real implementations with mock objects during testing.
 */
public class Main {
    public static void main(String[] args) {
        // Create instances of services
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        // Create instances of MessageProcessor with injected services
        MessageProcessor emailProcessor = new MessageProcessor(emailService);
        MessageProcessor smsProcessor = new MessageProcessor(smsService);

        // Send messages using the processors
        emailProcessor.sendNotification("Hello, this is an email notification.");
        smsProcessor.sendNotification("Hi, this is an SMS notification.");
    }
}
