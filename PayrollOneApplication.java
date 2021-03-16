import java.util.Scanner; 
import java.text.DecimalFormat;

/*
 * 
 * Objective:    This program uses the PayrollClassOne class
 *               to create two objects or instances of the 
 *               class.  The program outputs the information
 *               to the user.
 *             
 *             
 *             
 * Author:       Your Name
 *
 * Date:         Current Date
 *
*/

public class PayrollOneApplication
{
    public static void main(String[] args) 
    {
        // Define the programmer-defined variables 
        int    employeeNumber;
        String employeeName;
        double hoursWorked;
        double rateOfPay;

        // Create a Scanner object for th keyboard input
        Scanner keyboardInput = new Scanner(System.in);
        
        // Create an object of the PayrollClassOne Class
        // using the no-arg constructor
        PayrollClassOne payrollObjectOne = new PayrollClassOne();

        // Call the method passing the object as the
        // argument to the method to display the
        // information to the user
        displayDetailInformation(payrollObjectOne);
        
        // Call the method to obtain the employee number
        employeeNumber  = obtainEmployeeNumber();
            
        // Call the method to obtain the employee name
        employeeName    = obtainEmployeeName();
            
        // Call the method to obtain the hours worked
        hoursWorked     = obtainHoursWorked();
            
        // Call the method and obtain the rate of pay
        rateOfPay       = obtainRateOfPay();
        
        // Create an object of the PayrollClassOne Class
        // using the constructor
        PayrollClassOne payrollObjectTwo = new 
                        PayrollClassOne(employeeNumber,
                                        employeeName,
                                        hoursWorked,
                                        rateOfPay);

        // Call the method passing the object as the
        // argument to the method to display the
        // information to the user
        displayDetailInformation(payrollObjectTwo);
            
    } // End of main method

    // Method to obtain and return the employee number
    public static int obtainEmployeeNumber()
    {
        // Define the programmer-defined local variable
        int employeeNumber;
        
        // Create a Scanner object for keyboard input
        Scanner keyboardInput = new Scanner(System.in);
        
        // Obtain the employee number from the user
        System.out.print("Enter the Employee Number ");
        employeeNumber = keyboardInput.nextInt();
        
        // Return the employee number back to the main method
        return employeeNumber;
    }

    // Method to obtain and return the employee name
    public static String obtainEmployeeName()
    {
        // Define the programmer-defined local variable
        String employeeName;
        
        // Create a Scanner object for keyboard input
        Scanner keyboardInput = new Scanner(System.in);
        
        // Obtain the employee name from the user
        System.out.print("Enter the Employee Name ");
        employeeName    = keyboardInput.nextLine();
        
        // Return the employee name back to the main method
        return employeeName;
    }

    // Method to obtain and return the hoursWorked
    public static double obtainHoursWorked()
    {
        // Define the programmer-defined local variable
        double hoursWorked;
        
        // Create a Scanner object for keyboard input
        Scanner keyboardInput = new Scanner(System.in);
        
        // Obtain the hours worked from the user
        System.out.print("Enter the Hours Worked ");
        hoursWorked = keyboardInput.nextDouble();
        
        // Return the hours worked back to the main method
        return hoursWorked;
    }

    // Method to obtain and return the rateOfPay
    public static double obtainRateOfPay()
    {
        // Define the programmer-defined local variable
        double rateOfPay;
     
        // Create a Scanner object for keyboard input
        Scanner keyboardInput = new Scanner(System.in);
      
        // Obtain the rate of pay from the user
        System.out.print("Enter the Rate of Pay ");
        rateOfPay = keyboardInput.nextDouble();

        // Return the rate of pay back to the main method
        return rateOfPay;  
    }

    // Method to display the payroll information to the user
    public static void displayDetailInformation(PayrollClassOne
                                                payrollObject)
    {
        // Format the output 
        DecimalFormat formatOutput = new DecimalFormat("#####.00");
    
        // Display the information to the user
        System.out.println();
        System.out.println("The Employee Number is    " + 
                           payrollObject.getEmployeeNumber());
        System.out.println("The Employee Name   is    " + 
                          payrollObject.getEmployeeName());
        System.out.println("The Gross Pay       is    " +
                          (formatOutput.format
                          (payrollObject.getGrossPay())));
        System.out.println("The Deductions      are   " +
                          (formatOutput.format
                          (payrollObject.getDeductions())));
        System.out.println("The Net Pay         is    " + 
                          (formatOutput.format
                          (payrollObject.getNetPay())));
        System.out.println();
    }

} // End of the class
// Copyright Material - Nancy S. Grant - All Rights Reserved