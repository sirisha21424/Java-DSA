class Solution {
    public int[] minToMaxHeap(int[] nums) {
                int n = nums.length;
        int[] arr = nums.clone();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        return arr;


    }
    private void heapify(int[] arr, int i, int n) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, n);
        }
}
}