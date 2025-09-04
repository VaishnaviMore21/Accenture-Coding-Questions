class Solution {
    int missingNum(int arr[]) {
        int N = arr.length + 1; // Since one number is missing
        int hash[] = new int[N + 1]; // hash[1...N]

        // Count the frequencies
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // Find the number which is missing
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1; // Should never reach here
    }
}
