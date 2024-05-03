package motorph2_v1;
import java.util.Scanner;

public class EmployeeDetails {
         
 
    public String employeeNumber;
    public String lastName;
    public String firstName;
    public String birthdate;
    public String address;
    public String contactNo;
    public String sssNo;
    public String philhealthNo;
    public String tinNo;
    public String pagibigNo;
    public String status;
    public String position;
    public String immediateSupervisor;

    public double basicSalary;
    public double riceSubsidy;
    public double phoneAllowance;
    public double clothingAllowance;
    public double hourlyRate;

    public void storePersonalInfo(Info info) {
       
        
        
        
    }

    public Info readPersonalInfo() {
        // Implementation to read personal information
        return null; // Placeholder, replace with actual implementation
    }

    public Info writePersonalInfo() {
        // Implementation to write personal information
        return null; // Placeholder, replace with actual implementation
    }

    public void deletePersonalInfo() {
        // Implementation to delete personal information
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a new Scanner object
        System.out.println("\nEmployee Personal Details:");
        System.out.print("Enter Employee ID Number: ");
        String inputEmployeeNumber = scanner.nextLine();
    }

    // Placeholder Info class definition
    class Info {
        
    }
}