import java.util.List;

public class Searching {
    
    public static int binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        long startTime = System.nanoTime();

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = list.get(mid);

            if (num == target) {
                long endTime = System.nanoTime();
                long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
                System.out.println("Execution time: " + duration + " milliseconds");
                return mid;
            } else if (num < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
        System.out.println("Execution time: " + duration + " milliseconds");
        return -1;
    }

    public static int linearSearch(List<Integer> list, int target) {
        long startTime = System.nanoTime();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                long endTime = System.nanoTime();
                long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
                System.out.println("Execution time: " + duration + " milliseconds");
                return i;
            }
        }
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
        System.out.println("Execution time: " + duration + " milliseconds");
        return -1;
    }
    
    public static int ternarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int partitionSize = (right - left) / 3;
            int mid1 = left + partitionSize;
            int mid2 = right - partitionSize;

            int num1 = list.get(mid1);
            int num2 = list.get(mid2);

            if (num1 == target) {
                return mid1;
            } else if (num2 == target) {
                return mid2;
            } else if (target < num1) {
                right = mid1 - 1;
            } else if (target > num2) {
                left = mid2 + 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }

    
        return -1;
    }

}