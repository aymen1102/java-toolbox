package solid.dependencyInversion;

// Implementation of the MessageService interface
class EmailService implements MessageService {
    public void sendMessage(String message) {
        // Logic to send an email
        System.out.println("Email sent: " + message);
    }
}
