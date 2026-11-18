public class Conditions {
    public static void main(String[] args) {
        int score = 8;

        if (score >= 8) {
            System.out.println("Good job!");
        } else if (score >= 5) {
            System.out.println("Keep practicing!");
        } else {
            System.out.println("Try again!");
        }

        int day = 2;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Other day");
        }
    }
}
