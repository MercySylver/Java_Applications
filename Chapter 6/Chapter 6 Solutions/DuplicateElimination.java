import java.util.Scanner;

public class DuplicateElimination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] uniqueNumbers = new int[5];  
        int count = 0;  // To keep track of how many unique numbers we have entered
        
        // Loop to input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number between 10 and 100: ");
            int number = scanner.nextInt();
            
            // Check if the number is within the valid range
            if (number < 10 || number > 100) {
                System.out.println("Please enter a number between 10 and 100.");
                i--;  // Decrement to repeat this iteration
                continue;
            }

            // Check if the number is a duplicate
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (uniqueNumbers[j] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the array and display the unique numbers
            if (!isDuplicate) {
                uniqueNumbers[count] = number;
                count++;

                System.out.println("Unique values so far: ");
                for (int k = 0; k < count; k++) {
                    System.out.print(uniqueNumbers[k] + " ");
                }
                System.out.println();  // Move to the next line
            } else {
                System.out.println("Duplicate value. Please enter a unique number.");
            }
        }

        scanner.close();
    }
}
