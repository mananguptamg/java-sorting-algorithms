public class SortingStudentAges {

    // Method to perform Counting Sort
    public static void countingSort(int[] ages) {
        int minAge = 10; // Minimum age in the range
        int maxAge = 18; // Maximum age in the range
        int range = maxAge - minAge + 1; // Total possible age values

        // Step 1: Create a count array to store frequency of each age
        int[] count = new int[range];

        // Step 2: Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 3: Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Place elements in their correct position in the output array
        int[] sortedAges = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            sortedAges[position] = age;
            count[age - minAge]--; // Decrease count
        }

        // Step 5: Copy the sorted values back to the original array
        System.arraycopy(sortedAges, 0, ages, 0, ages.length);
    }

    // Main method to test sorting
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 17};

        // Sorting the ages
        countingSort(studentAges);

        // Display sorted ages
        System.out.println("Sorted Student Ages:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}
