public class SortingProductPrices {

    // Method to sort product prices using Quick Sort
    public static void quickSort(int[] prices, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(prices, left, right);
            quickSort(prices, left, partitionIndex - 1);
            quickSort(prices, partitionIndex + 1, right);
        }
    }

    // Partition method to place pivot at correct position
    private static int partition(int[] prices, int left, int right) {
        int pivot = prices[right]; // Choosing the last element as the pivot
        int i = left - 1; // Pointer for smaller elements

        for (int j = left; j < right; j++) {
            if (prices[j] < pivot) {
                i++;
                swap(prices, i, j);
            }
        }
        swap(prices, i + 1, right); // Place pivot at correct position
        return i + 1;
    }

    // Method to swap two elements
    private static void swap(int[] prices, int i, int j) {
        int temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }

    // Main method to test sorting
    public static void main(String[] args) {
        int[] productPrices = {490, 433, 782, 223, 873, 289};

        // Sorting the prices
        quickSort(productPrices, 0, productPrices.length - 1);

        // Display sorted prices
        System.out.println("Sorted Product Prices:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
    }
}
