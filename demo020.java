import java.util.Scanner;

public class demo020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter monthly gross salary (Rs): ");
        double monthlyGrossSalary = scanner.nextDouble();

        System.out.print("Enter monthly HRA (Rs): ");
        double monthlyHRA = scanner.nextDouble();

        System.out.print("Enter monthly PF (Rs): ");
        double monthlyPF = scanner.nextDouble();

        
        double annualGrossSalary = monthlyGrossSalary * 12;
        double annualHRA = monthlyHRA * 12;
        double annualPF = monthlyPF * 12;

        
        double deductions = annualHRA + annualPF;
        double taxableIncome = annualGrossSalary - deductions;

       
        double tax = 0;
        if (taxableIncome > 1000000) {
            tax += 0.30 * (taxableIncome - 1000000); 
            tax += 0.20 * 500000; 
            tax += 0.10 * 500000; 
        } else if (taxableIncome > 500000) {
            tax += 0.20 * (taxableIncome - 500000); 
            tax += 0.10 * 500000; 
        } else if (taxableIncome > 0) {
            tax += 0.10 * taxableIncome; 
        }

        
        System.out.println("Annual Gross Salary: Rs " + annualGrossSalary);
        System.out.println("Annual Deductions (HRA + PF): Rs " + deductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        System.out.println("Annual Income Tax: Rs " + tax);

        scanner.close();
    }
}
