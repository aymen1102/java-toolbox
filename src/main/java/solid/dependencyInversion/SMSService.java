package solid.dependencyInversion;

// Another implementation of the MessageService interface
public class SMSService implements MessageService {
    public void sendMessage(String message) {
        // Logic to send an SMS
        System.out.println("SMS sent: " + message);
    }
}