package solid.dependencyInversion;

/**
 * Dependency Inversion Principle (DIP) is a fundamental principle in object-oriented programming that forms part of the SOLID acronym.
 * It states two key things:
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.
 * In essence, DIP advocates for a system design where the high-level policy-setting modules are not tightly coupled with the low-level modules
 * that provide the basic functionality. Instead, both should rely on abstract interfaces. This results in a system that is more decoupled,
 * easier to modify, and more amenable to testing and maintenance, as changes in low-level modules (like changes in data sources or third-party libraries)
 * do not directly impact the high-level modules.
 */
public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MessageController messageController = new MessageController(emailService);
        messageController.sendNotification("Hello, this is an email notification.");
    }
}
