import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Co Pilots!");
        SortingClass sortingClass = new SortingClass();
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 6, 2, 7, 8, 5));
        System.out.println("Unsorted: " + numbers);
        System.out.println("Bubble Sort: " + sortingClass.bubbleSort(numbers));
        System.out.println("Selection Sort: " + sortingClass.selectionSort(numbers));

        long startTime = System.nanoTime();
        System.out.println("Quick Sort: " + sortingClass.quickSort(numbers));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        long durationInMiliSeconds = TimeUnit.NANOSECONDS.toMillis(duration);
        System.out.println("Quick Sort execution time: " + durationInMiliSeconds + " mili seconds");


        System.out.println("***** Searching *****");
        System.out.println("Binary Search: " + Searching.binarySearch(numbers, 7));
        System.out.println("Linear Search: " + Searching.linearSearch(numbers, 7));
        System.out.println("Ternary Search: " + Searching.ternarySearch(numbers, 7));
        
    }
}
