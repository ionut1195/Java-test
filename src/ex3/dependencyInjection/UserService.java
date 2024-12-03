package ex3.dependencyInjection;

public class UserService {
    private EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String email) {
        System.out.println("Registering user...");
        emailService.sendEmail(email, "Welcome!");
    }
}

class EmailService {
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}