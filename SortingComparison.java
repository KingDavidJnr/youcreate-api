import java.util.Random;
import java.util.Arrays;

public class SortingComparison {

    private static final Random random = new Random();

    public static void main(String[] args) {

        int[] sizes = {10, 50, 100};

        System.out.println("===============================================");
        System.out.printf("%-10s %-20s %-20s%n",
                "Size",
                "Merge Sort (ns)",
                "Quick Sort (ns)");
        System.out.println("===============================================");

        for (int size : sizes) {

            int[] original = generateRandomArray(size);

            int[] mergeArray = Arrays.copyOf(original, original.length);
            int[] quickArray = Arrays.copyOf(original, original.length);

            long mergeStart = System.nanoTime();
            MergeSort.sort(mergeArray);
            long mergeEnd = System.nanoTime();

            long quickStart = System.nanoTime();
            QuickSort.sort(quickArray);
            long quickEnd = System.nanoTime();

            long mergeTime = mergeEnd - mergeStart;
            long quickTime = quickEnd - quickStart;

            System.out.printf("%-10d %-20d %-20d%n",
                    size,
                    mergeTime,
                    quickTime);
        }

        System.out.println("===============================================");
    }

    private static int[] generateRandomArray(int size) {

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }

        return array;
    }
}