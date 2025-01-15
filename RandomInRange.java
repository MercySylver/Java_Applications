import java.util.Random;
import java.util.Scanner;

public class RandomInRange {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the upper bound (N) for the random number range: ");
        int upperBound = scanner.nextInt();
        
        if (upperBound <= 0) {
            System.out.println("Please enter a positive integer for the upper bound.");
        } else {
            
            int randomNumber = random.nextInt(upperBound) + 1;  
            System.out.println("Random number between 1 and " + upperBound + ": " + randomNumber);
        }
        
        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
