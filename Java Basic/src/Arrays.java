public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        System.out.println("First item: " + numbers[0]);
        System.out.println("Length: " + numbers.length);

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println(java.util.Arrays.toString(numbers));
    }
}
