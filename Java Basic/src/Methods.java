public class Methods {
    public static void main(String[] args) {
        greet("Java learner");
        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static int add(int a, int b) {
        return a + b;
    }
}
