package motorph2_v1;
import java.util.Scanner;


public class MainMenu {
    
  private EmployeeDetails employeeDetails;
    private Attendance attendance;
    private Payroll payroll;

    public MainMenu(EmployeeDetails employeeDetails, Attendance attendance, Payroll payroll) {
        this.employeeDetails = employeeDetails;
        this.attendance = attendance;
        this.payroll = payroll;
    }

    public void showEmployeeDetailsMenu() {
        
        System.out.println("Redirecting to Employee Details...");
        employeeDetails.main(null); // Call the main method of EmployeeDetails class
    }

    public void showAttendanceMenu() {
        System.out.println("Attendance Menu:");
        
    }

    public void showPayrollMenu() {
        System.out.println("Payroll Menu:");
        
    }

    public boolean logout() {
        System.out.println("Logging out...");
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu(new EmployeeDetails(), new Attendance(), new Payroll());

        while (true) {
            System.out.println(" ");
            System.out.println("WELCOME TO MOTORPH");
            System.out.println("Main Menu:");
            System.out.println("[1] Employee Details");
            System.out.println("[2] Attendance");
            System.out.println("[3] Payroll");
            System.out.println("[4] Logout");
            System.out.println(" ");
            System.out.print("Enter Option No.: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    mainMenu.showEmployeeDetailsMenu();
                    break;
                case 2:
                    mainMenu.showAttendanceMenu();
                    break;
                case 3:
                    mainMenu.showPayrollMenu();
                    break;
                case 4:
                    if (mainMenu.logout()) {
                        System.out.println("Logout successful");
                        return; // exit the main method
                    }
                    break;
    default:
        System.out.println("Invalid option");
}
        //to break the loop in the main menu after encoding an option, if we want to put back the loop, remove this.
        if (option == 1) {
        break;
            }
        }
    }
 }
