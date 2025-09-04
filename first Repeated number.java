import java.util.*;

class Solution {
    public static int firstRepeated(int[] arr) {
        HashMap<Integer, Integer> firstIndexMap = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (firstIndexMap.containsKey(arr[i])) {
                // Element repeated, update minIndex if first occurrence is smaller
                minIndex = Math.min(minIndex, firstIndexMap.get(arr[i]));
            } else {
                // Store first occurrence index
                firstIndexMap.put(arr[i], i);
            }
        }

        // If no repeating element, return -1
        return (minIndex == Integer.MAX_VALUE) ? -1 : (minIndex + 1); // 1-based indexing
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println("First repeating element position: " + firstRepeated(arr));
    }
}
