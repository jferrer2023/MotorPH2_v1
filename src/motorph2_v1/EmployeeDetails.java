package motorph2_v1;

import java.io.File;
import java.io.FileNotFoundException;
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

    public float basicSalary;
    public float riceSubsidy;
    public float phoneAllowance;
    public float clothingAllowance;
    public float hourlyRate;

   

    public Info readPersonalInfo(String employeeId) {
        
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\IT-Spare\\Documents\\NetBeansProjects\\MotorPH2_v1\\src\\motorph2_v1\\MotorPH Employee Details.csv"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                if (tokens[0].equals(employeeId)) {
                    this.employeeNumber = tokens[0];
                    this.lastName = tokens[1];
                    this.firstName = tokens[2];
                    this.birthdate = tokens[3];
                    this.address = tokens[4];
                    this.contactNo = tokens[5];
                    this.sssNo = tokens[6];
                    this.philhealthNo = tokens[7];
                    this.tinNo = tokens[8];
                    this.pagibigNo = tokens[9];
                    this.status = tokens[10];
                    this.position = tokens[11];
                    this.immediateSupervisor = tokens[12];
                    this.basicSalary = Float.parseFloat(tokens[13]);
                    this.riceSubsidy = Float.parseFloat(tokens[14]);
                    this.phoneAllowance = Float.parseFloat(tokens[15]);
                    this.clothingAllowance = Float.parseFloat(tokens[16]);
                    this.hourlyRate = Float.parseFloat(tokens[17]);
                    return new Info(); // Return an instance of Info with the retrieved data
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return null; // Employee ID not found
    }

    public Info writePersonalInfo() {
        
        return null; 
    }

    public void deletePersonalInfo() {
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("\nEmployee Personal Details:");
        System.out.print("Enter Employee ID Number: ");
        String inputEmployeeNumber = scanner.nextLine();
        EmployeeDetails employeeDetails = new EmployeeDetails();
        Info info = employeeDetails.readPersonalInfo(inputEmployeeNumber);
        if (info != null) {
            System.out.println("Employee Number: " + employeeDetails.employeeNumber);
            System.out.println("Last Name: " + employeeDetails.lastName);
            System.out.println("First Name: " + employeeDetails.firstName);
            // Print other details similarly
        } else {
            System.out.println("Employee not found");
        }
    }

    // Placeholder Info class definition
    class Info {

    }
}
