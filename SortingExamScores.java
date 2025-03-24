public class SortingExamScores {

    // Method to sort exam scores using Selection Sort
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first unsorted element is the smallest

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            swap(scores, i, minIndex);
        }
    }

    // Method to swap two elements in an array
    private static void swap(int[] scores, int i, int j) {
        int temp = scores[i];
        scores[i] = scores[j];
        scores[j] = temp;
    }

    // Main method to test sorting
    public static void main(String[] args) {
        int[] examScores = {85, 72, 90, 66, 88, 79};

        // Sorting the scores
        selectionSort(examScores);

        // Display sorted scores
        System.out.println("Sorted Exam Scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
