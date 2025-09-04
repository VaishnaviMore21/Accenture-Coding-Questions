// User function Template for Java

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        return getMinMaxHelper(arr, 0, arr.length - 1);
    }

    private Pair<Integer, Integer> getMinMaxHelper(int[] arr, int low, int high) {
        // Base case: only one element
        if (low == high) {
            return new Pair<>(arr[low], arr[low]);
        }

        // Base case: two elements
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                return new Pair<>(arr[high], arr[low]);
            } else {
                return new Pair<>(arr[low], arr[high]);
            }
        }

        // More than 2 elements → divide and conquer
        int mid = (low + high) / 2;
        Pair<Integer, Integer> left = getMinMaxHelper(arr, low, mid);
        Pair<Integer, Integer> right = getMinMaxHelper(arr, mid + 1, high);

        // Compare results
        int minVal = Math.min(left.getKey(), right.getKey());
        int maxVal = Math.max(left.getValue(), right.getValue());

        return new Pair<>(minVal, maxVal);
    }
}
