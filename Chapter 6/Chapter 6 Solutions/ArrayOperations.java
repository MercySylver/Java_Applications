import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        // a) Set the 10 elements of integer array counts to zero
        int[] counts = new int[10];
        Arrays.fill(counts, 0);  // Set all elements to 0

        // b) Add one to each of the 15 elements of integer array bonus
        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;  // Add 1 to each element
        }

        // c) Display the five values of integer array bestScores in column format
        int[] bestScores = {85, 92, 78, 88, 94};
        System.out.println("Best Scores:");
        for (int score : bestScores) {
            System.out.println(score);  // Display each value on a new line
        }
    }
}
