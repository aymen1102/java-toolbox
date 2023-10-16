package solid.dependencyInversion;

public class MessageProcessor {
    private MessageService service;

    // Constructor-based dependency injection
    public MessageProcessor(MessageService service) {
        this.service = service;
    }

    public void sendNotification(String message) {
        // Use the injected service to send a message
        service.sendMessage(message);
    }
}