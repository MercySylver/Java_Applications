import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        
        int[] salaryRanges = new int[10];  
        
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("Enter the number of salespeople: ");
        int NumberOfSalespeople = scanner.nextInt();

        // Loop through each salesperson's data
        for (int i = 1; i <= NumberOfSalespeople; i++) {
            System.out.print("Enter the gross sales for salesperson " + i + ": ");
            double grossSales = scanner.nextDouble();

            // Calculate total salary: $200 base + 9% of gross sales
            double totalSalary = 200 + (0.09 * grossSales);
            int truncatedSalary = (int) totalSalary; // Truncate to integer
            
            // Determine the range in which the salary falls
            if (truncatedSalary >= 200 && truncatedSalary < 300) {
                salaryRanges[0]++; // $200–299
            } else if (truncatedSalary >= 300 && truncatedSalary < 400) {
                salaryRanges[1]++; // $300–399
            } else if (truncatedSalary >= 400 && truncatedSalary < 500) {
                salaryRanges[2]++; // $400–499
            } else if (truncatedSalary >= 500 && truncatedSalary < 600) {
                salaryRanges[3]++; // $500–599
            } else if (truncatedSalary >= 600 && truncatedSalary < 700) {
                salaryRanges[4]++; // $600–699
            } else if (truncatedSalary >= 700 && truncatedSalary < 800) {
                salaryRanges[5]++; // $700–799
            } else if (truncatedSalary >= 800 && truncatedSalary < 900) {
                salaryRanges[6]++; // $800–899
            } else if (truncatedSalary >= 900 && truncatedSalary < 1000) {
                salaryRanges[7]++; // $900–999
            } else if (truncatedSalary >= 1000) {
                salaryRanges[8]++; // $1000 and over
            }
        }

        // Output the results in tabular format
        System.out.println("\nSalary Range\t\tCount");
        System.out.println("======================================");
        System.out.println("$200 - $299\t\t" + salaryRanges[0]);
        System.out.println("$300 - $399\t\t" + salaryRanges[1]);
        System.out.println("$400 - $499\t\t" + salaryRanges[2]);
        System.out.println("$500 - $599\t\t" + salaryRanges[3]);
        System.out.println("$600 - $699\t\t" + salaryRanges[4]);
        System.out.println("$700 - $799\t\t" + salaryRanges[5]);
        System.out.println("$800 - $899\t\t" + salaryRanges[6]);
        System.out.println("$900 - $999\t\t" + salaryRanges[7]);
        System.out.println("$1000 and over\t\t" + salaryRanges[8]);

        scanner.close();
    }
}