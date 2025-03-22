public class SortingMarks {

    // Method to perform Bubble Sort on the array
    static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        // Traverse through the array multiple times
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements and swap if needed
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j+1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps were made in this pass, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Array representing student marks
        int[] studentMarks = {85, 72, 90, 60, 88, 76, 95, 70};

        System.out.println("Original Marks:");
        printArray(studentMarks);

        // Sorting the marks using Bubble Sort
        bubbleSort(studentMarks);

        System.out.println("Sorted Marks :");
        printArray(studentMarks);
    }
}
