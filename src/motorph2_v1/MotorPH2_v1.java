    
//MO-IT103_S1101_Group5 - Jeffrey Dollopac, Joyce Ferrer, Ryu Ken Lindo, Mikko Jerome Bautista
    

    package motorph2_v1;
    import java.util.Scanner;

    public class MotorPH2_v1 {

        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        UserLogin userLogin = new UserLogin(inputUsername, inputPassword);

        System.out.println("Authenticating...");
        if (userLogin.authenticate()) {
            System.out.println("Authentication successful");
            EmployeeDetails employeeDetails = new EmployeeDetails();
            Attendance attendance = new Attendance();
            Payroll payroll = new Payroll();
            MainMenu mainMenu = new MainMenu(employeeDetails, attendance, payroll);
            mainMenu.main(args); // Call the main menu's main method
        } else {
            System.out.println("Authentication failed");
        }

        scanner.close();
    }
}
            
       
            
       