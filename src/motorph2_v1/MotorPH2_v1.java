    
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
        
        //to access the Login Class
        UserLogin userLogin = new UserLogin(inputUsername, inputPassword);

        System.out.println("Authenticating...");
        
        //check authenticate() method defined in UserLogin class. 
        //This method is to verify if the username and password matched
        if (userLogin.authenticate()) { 
            System.out.println("Authentication successful");
            
            //to access the Employee, Attendance, Payroll Class
            EmployeeDetails employeeDetails = new EmployeeDetails();
            Attendance attendance = new Attendance();
            Payroll payroll = new Payroll();
            MainMenu MainMenu = new MainMenu(employeeDetails, attendance, payroll);
            
            MainMenu.main(args); //To call the MainMenu class after login
            
        } else {
            System.out.println("Authentication failed");
        }

        scanner.close();
    }
}
            
       
            
       