package ex1;

public class Main {
    public static void main(String[] args) {
        DamageChecker checker = new DamageChecker();
        System.out.println(checker.matches("damage"));
        System.out.println(checker.matches("minor damages"));
        System.out.println(checker.matches("heavy damage"));
        System.out.println(checker.matches("no damages"));
        System.out.println(checker.matches("damage here"));
    }
}

