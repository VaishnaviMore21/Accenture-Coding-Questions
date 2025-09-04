class Solution {
    public static int subArraySum(int[] arr, int k) {
        // code here.
            Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // prefix sum = 0 exists once before starting

        int prefixSum = 0;
        int count = 0;

        // Simple for loop
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];   // add current element

            int target = prefixSum - k;

            // If target exists in map, then those subarrays end here
            if (map.containsKey(target)) {
                count += map.get(target);
            }

            // Store current prefixSum in map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    
    }
}
