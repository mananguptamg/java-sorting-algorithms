public class SortingBookPrices {

    // Method to perform Merge Sort
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // Recursively sort the left half
            mergeSort(prices, left, mid);

            // Recursively sort the right half
            mergeSort(prices, mid + 1, right);

            // Merge the two sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Method to merge two sorted subarrays
    public static void merge(int[] prices, int left, int mid, int right) {
        // Sizes of the two subarrays
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        // Temporary arrays to hold subarrays
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy data into temporary arrays
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = prices[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        // Merge the two subarrays
        int i = 0, j = 0, k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray
        while (i < leftSize) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray
        while (j < rightSize) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Method to print the array
    public static void printArray(int[] prices) {
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Array representing book prices
        int[] bookPrices = {240, 110, 409, 149, 294, 144, 122};

        System.out.println("Original Book Prices:");
        printArray(bookPrices);

        // Sorting the book prices using Merge Sort
        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Book Prices :");
        printArray(bookPrices);
    }
}
