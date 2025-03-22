public class SortingEmployeeID {

    // Method to perform Insertion Sort on the array
    public static void insertionSort(int[] employeeIDs) {
        int n = employeeIDs.length;

        // Start from the second element (index 1) as the first element is already sorted
        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i]; // Pick the element from the unsorted part
            int j = i - 1;

            // Move elements of the sorted part that are greater than key to one position ahead
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }

            // Insert the picked element at the correct position
            employeeIDs[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] employeeIDs) {
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Array representing unsorted employee IDs
        int[] employeeIDs = {105, 102, 110, 101, 108, 103, 107};

        System.out.println("Original Employee IDs:");
        printArray(employeeIDs);

        // Sorting the employee IDs using Insertion Sort
        insertionSort(employeeIDs);

        System.out.println("Sorted Employee ID :");
        printArray(employeeIDs);
    }
}
