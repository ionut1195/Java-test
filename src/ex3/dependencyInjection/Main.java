package ex3.dependencyInjection;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService(); // dependency created externally
        UserService userService = new UserService(emailService); // injected into UserService

        userService.registerUser("test@test.com");
    }
}
