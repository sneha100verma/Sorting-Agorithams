class QuickSort {
    public static void main(String args[]) {
        int[] arr = { 13, 23, 88, 7, 9, 2, 1, 45, 78 };
        QuickSort q = new QuickSort();

        q.quickSortRec(arr, 0, arr.length - 1);
        q.printArray(arr);
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2]; // Calculate pivot as the median of low and high
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }

            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    void quickSortRec(int[] arr, int low, int high) {
        int newLow = partition(arr, low, high);
        if (low < newLow - 1) {
            quickSortRec(arr, low, newLow - 1);
        }
        if (newLow < high) {
            quickSortRec(arr, newLow, high);
        }
    }

    void printArray(int[] arr) {
        System.out.println("Your Quick Sort result is: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
