
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        String employeeName; 
        double employeeSalary; 
        boolean isIndian; 
        double tax; 


        Scanner sc = new Scanner(System.in);

        TaxCalculator emp1 = new TaxCalculator(); 

        //System.out.println("Adult only user account");
        //sc = new Scanner(System.in);
        System.out.println("Enter name:");
        employeeName = sc.nextLine();

        System.out.println("Is nationality Indian (True/False):");
        isIndian = sc.nextBoolean();

        System.out.println("Enter Salary amount:");
        employeeSalary = sc.nextDouble();
        
        //invoke calculateTax method
        //emp1.calculateTax(employeeName, isIndian, employeeSalary);
        
        
         
        try {
           tax = emp1.calculateTax(employeeName, isIndian, employeeSalary);
           System.out.println("tax amount is:" + tax);
        } 
        catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException c) {
            
            if(employeeName.isEmpty()){
                System.out.println("The employee name cannot be empty");
            }

            else if(!isIndian){
            System.out.println("The employee should be an Indian citizen for calculating tax");
            }
            
            else if(employeeSalary < 10000){
                System.out.println("The employee does not need to pay tax");
            }
        
        }
            
      
    }
}
