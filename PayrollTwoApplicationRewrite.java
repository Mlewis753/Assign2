import javax.swing.JOptionPane; 
import java.util.Scanner; 
import java.text.DecimalFormat;

/*
 * 
 * Objective:    This program uses the PayrollClassTwo class
 *               to create objects or instances in order 
 *               to work with a simple payroll system.
 *
 *               The program also implements a counter in order
 *               to count the number of objects processed, as
 *               well as three accumulators to total gross pay,
 *               deductions, and net pay.
 *             
 *             
 * Author:       Your Name
 *
 * Date:         Current Date
 *
*/

public class PayrollTwoApplicationRewrite
{
    public static void main(String[] args) 
    {
        // Define the programmer-defined variables 
        int    employeeNumber;
        String employeeName;
        double hoursWorked;
        double rateOfPay;
        double grossPay;
        double deductions;
        double netPay;

        // Create a Scanner object for th keyboard input
        Scanner keyboardInput = new Scanner(System.in);

        // Define a programmer-defined variable to hold input data
        String inputData;

        // Define a programmer-defined variable to handle the program iteration
        boolean processObjects = true;
        
        // Prompt the user if they would like to run the program
        inputData      = JOptionPane.showInputDialog(null,
                         "Would you like to execute the program\n"
                         + " Type true for yes or false for no ");
        processObjects = Boolean.parseBoolean(inputData);
        
        // while loop to process multiple objects
        while (processObjects)
        {                
           // Call the method to obtain the employee number
           employeeNumber  = obtainEmployeeNumber();
            
           // Call the method to obtain the employee name
           employeeName    = obtainEmployeeName();
            
           // Call the method to obtain the hours worked
           hoursWorked     = obtainHoursWorked();
            
           // Call the method and obtain the rate of pay
           rateOfPay       = obtainRateOfPay();
        
           // Create an object of the PayrollClassTwo Class
           // using the constructor
           PayrollClassTwo payrollObject = new 
        	               PayrollClassTwo(employeeNumber,
        	                               employeeName,
        	                               hoursWorked,
        	                               rateOfPay);
        	                               
           // Call the method passing the object as the
           // argument to the method to display the
           // information to the user
           displayDetailInformation(payrollObject);
           
           // Call the classes method to add to the counter
           PayrollClassTwo.addToCounter();
           
           // Call the classes (object) method to obtain
           // the gross pay for the employee
           grossPay   = payrollObject.getGrossPay();
           
           // Call the classes method passing the
           // argument gross pay to add to the gross pay accumulator 
           PayrollClassTwo.totalGrossPay(grossPay);
           
           // Call the classes (object) method to obtain
           // the deductions for the employee
           deductions = payrollObject.getDeductions();
           
           // Call the classes method passing the
           // argument deductions to add to the deductions accumulator
           PayrollClassTwo.totalDeductions(deductions);
           
           // Call the classes (object) method to obtain
           // the net pay for the employee
           netPay     = payrollObject.getNetPay();
           
           // Call the classes method passing the
           // argument net pay to add to the net pay accumulator
           PayrollClassTwo.totalNetPay(netPay);
           
           // Prompt the user if they want to run the program again
           inputData      = JOptionPane.showInputDialog(null,
                            "Would you like to execute the program again\n"
                            + " Type true for yes or false for no ");

           processObjects = Boolean.parseBoolean(inputData);

        } // End of while loop
        
        // Call the method to display the summary information to the user
        displaySummaryInformation();
            
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
    public static void displayDetailInformation(PayrollClassTwo
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
    
    
    // Method to display the counter and the accumulators to the user
    public static void displaySummaryInformation()
    {
        // Format the output 
        DecimalFormat formatOutput = new DecimalFormat("#####.00");
    
        // Display the counter and the accumulators to the user
        System.out.println();
        System.out.println("The number of records processed is " +
        	               PayrollClassTwo.getTheCounter());
        System.out.println("The Total Gross Pay       is       " +
                          (formatOutput.format
                          (PayrollClassTwo.getTotalGrossPay())));
        System.out.println("The Total Deductions      are      " +
                          (formatOutput.format
                          (PayrollClassTwo.getTotalDeductions())));
        System.out.println("The Total Net Pay         is       " + 
                          (formatOutput.format
                          (PayrollClassTwo.getTotalNetPay())));
    }
} // End of the class
// Copyright Material - Nancy S. Grant - All Rights Reserved