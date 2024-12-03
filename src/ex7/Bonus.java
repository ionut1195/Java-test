package ex7;

public class Bonus {
    public static String chooseString(boolean choice) {
        String[] chars = {"a", "b", "c"};
        int index = choice ? 0 : (int)(Math.random() * 3);
        // return a randomly selected string from the array
        return chars[index];

    }

    public static void main(String[] args) {
        System.out.println(chooseString(true));
        System.out.println(chooseString(false));
    }

}
