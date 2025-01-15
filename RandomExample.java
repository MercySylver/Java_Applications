import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        
        Random random = new Random();

        
        int randomIntegerNumber = random.nextInt();
        System.out.printf("Random Integer: %d%n",randomIntegerNumber);

        
        int randomIntegerNumberInRange = random.nextInt(10); 
        System.out.printf("Random Integer from 0 - 9: %d%n",randomIntegerNumberInRange);

        
        double randomDoubleNumber = random.nextDouble();
        System.out.printf("Random Double: %f",randomDoubleNumber);
		
		double randomDoubleNumberInRange = 10 + (30 - 10) * random.nextDouble();
		System.out.printf("Random Double from 10 - 30: %.2f%n",randomDoubleNumberInRange);

        
        boolean randomBoolean = random.nextBoolean();
        System.out.printf("Random Boolean: %b%n" , randomBoolean);
    }
}
