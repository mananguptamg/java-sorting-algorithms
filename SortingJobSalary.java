public class SortingJobSalary {

    // Method to perform Heap Sort
    public static void heapSort(double[] salaries) {
        int n = salaries.length;

        // Step 1: Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (largest element) with the last element
            swap(salaries, 0, i);

            // Heapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Method to maintain the heap property (Max Heap)
    private static void heapify(double[] salaries, int n, int i) {
        int largest = i; // Assume root is largest
        int left = 2 * i + 1; // Left child index
        int right = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not the root, swap and continue heapifying
        if (largest != i) {
            swap(salaries, i, largest);
            heapify(salaries, n, largest);
        }
    }

    // Method to swap two elements
    private static void swap(double[] salaries, int i, int j) {
        double temp = salaries[i];
        salaries[i] = salaries[j];
        salaries[j] = temp;
    }

    // Main method to test sorting
    public static void main(String[] args) {
        double[] salaryDemands = {21000, 36000, 24000, 10000, 30000};

        // Sorting the salary demands
        heapSort(salaryDemands);

        // Display sorted salaries
        System.out.println("Sorted Salary Demands:");
        for (double salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}
