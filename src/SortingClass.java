import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class SortingClass {
    
    public List<Integer> bubbleSort(List<Integer> list) {
        long startTime = System.nanoTime();
        
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap list[j] and list[j+1]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        long durationInMS = TimeUnit.NANOSECONDS.toSeconds(duration);
        System.out.println("Bubble Sort execution time: " + durationInMS + " mili seconds");
        
        return list;
    }
    
    public List<Integer> selectionSort(List<Integer> list) {
        long startTime = System.nanoTime();
        
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
        
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        long durationInMS = TimeUnit.NANOSECONDS.toMillis(duration);
        System.out.println("Selection Sort execution time: " + durationInMS + " mili seconds");
        
        return list;
    }
    
    public List<Integer> quickSort(List<Integer> list) {
        
        if (list.size() <= 1) {
            return list;
        }
        
        int pivot = list.get(list.size() - 1);
        List<Integer> smaller = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) <= pivot) {
                smaller.add(list.get(i));
            } else {
                greater.add(list.get(i));
            }
        }
        
        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(quickSort(smaller));
        sorted.add(pivot);
        sorted.addAll(quickSort(greater));        
        return sorted;
    }
}
