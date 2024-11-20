import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.Supplier;

public class AverageOfEvalMain {
    private static final int[] numbers = new int[10];

    public static void main(String[] args) throws Throwable {
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = new Random().nextInt(0, 50);
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("Среднее арифметическое всех четных чисел в массиве: " +
                Arrays.stream(
                        Arrays.stream(numbers)
                                .filter(number -> number % 2 == 0)
                                .toArray()).average()
                        .orElseThrow((Supplier<Throwable>) () -> new NoSuchElementException("Нет ни одного четного элемента в массиве.")));
    }
}
