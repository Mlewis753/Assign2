/*
 * 
 *Objective:    The objective of the program is to define
 *              the PayrollClassTwo class definition with
 *              the private data members, constants,
 *              constructors, as well as all of the methods
 *              needed for the class
 *             
 *             
 *             
 *             
 * Author:      Your Name
 *
 * Date:        Current Date
 *
*/

public class PayrollClassTwo
{
    // Data members (or fields) for the class
    private int    employeeNumber;
    private String employeeName;
    private double hoursWorked;
    private double rateOfPay;

    // Define programmer-defined static constants
    final static double FEDERAL_TAX_RATE = 0.07;
    final static double STATE_TAX_RATE   = 0.067;
    final static double LOCAL_TAX_RATE   = 0.01;

    // Define programmer-defined static counter
    static int numberOfObjects = 0;

    // Define programmer-defined static accumulators
    public static double totalGrossPay   = 0.0;
    public static double totalDeductions = 0.0;
    public static double totalNetPay     = 0.0;

    // This is the default constructor (no-argument)
    public PayrollClassTwo()
    {
        employeeNumber  = 1;
        employeeName    = "Test";
        hoursWorked     = 10.00;
        rateOfPay       = 25.00;
    }

    // Constructor 
    public PayrollClassTwo(int    employeeNumber,
                           String employeeName,
                           double hoursWorked,
                           double rateOfPay )
    {
        this.employeeNumber = employeeNumber;
        this.employeeName   = employeeName;
        this.hoursWorked    = hoursWorked;
        this.rateOfPay      = rateOfPay;
    }
    
    // Mutator mMethod to set the employee number
    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }
  
    // Accessor method to get the employee number    
    public int getEmployeeNumber()
    {
        return employeeNumber;
    }
    
    // Mutator method to set the employee name
    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }
    
    // Accessor method to get the employee name
    public String getEmployeeName()
    {
        return employeeName;
    }

    // Mutator method to set the hours worked
    public void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    
    // Accessor method to get the hours worked    
    public double getHoursWorked()
    {
        return hoursWorked;
    }

    // Mutator method to set the rate of pay
    public void setRateOfPay(float rateOfPay)
    {
        this.rateOfPay = rateOfPay;
    }
 
    // Accessor method to get the rate of pay
    public double getRateOfPay()
    {
        return rateOfPay;
    }
    
    // Method to calculate and return the grossPay
    public double getGrossPay()
    {
        // Define the programmer-defined local variables
        double regularPay;
        double overTimePay;
        double grossPay;

        // Calculate the gross pay
        if (hoursWorked <= 40.0)
           {
             regularPay  = hoursWorked * rateOfPay;
             overTimePay = 0.0;
           }
        else
           {
             regularPay  = 40.0 * rateOfPay;
             overTimePay = (hoursWorked - 40) * rateOfPay * 1.5;
           }

         grossPay        = regularPay + overTimePay;
         
         // Return the gross pay 
         return grossPay;
    }    
    
    // Method to calculate and return the deductions
    public double getDeductions()
    {            
        // Define the programmer-defined local variables
        double federalTax;
        double stateTax;
        double localTax;
        double deductions;

        // Calculate the deductions
        federalTax      = getGrossPay() * FEDERAL_TAX_RATE;
           
        stateTax        = getGrossPay() * STATE_TAX_RATE;
            
        localTax        = getGrossPay() * LOCAL_TAX_RATE;
            
        deductions      = federalTax + stateTax + localTax;
 
        // Return the deductions
        return deductions;
    }

    // Method to calculate and return the net pay
    public double getNetPay()
    {
        // Define the programmer-defined local variable
        double netPay;

        // Calculate the net pay
        netPay          = getGrossPay() - getDeductions();

        // Return the net pay
        return netPay;
    }

    // Method to add to the counter
    public static void addToCounter()
    {
        // Add to the counter to count the objects
        numberOfObjects = numberOfObjects + 1;
    }
   
    // Method to return the counter
    public static int getTheCounter()
    {
        return numberOfObjects;
    }
    
    // Method to add to the total gross pay accumulator
    public static void totalGrossPay(double grossPay)
    {
        // Add gross pay to the total gross pay accumulator
        totalGrossPay = totalGrossPay + grossPay;
    }

    // Method to return the total gross pay accumulator
    public static double getTotalGrossPay()
    {
        return totalGrossPay;
    }

    // Method to add to the total deductions accumulator
    public static void totalDeductions(double deductions)
    {
        // Add deductions to the total deductions accumulator
        totalDeductions = totalDeductions + deductions;
    }

    // Method to return the total deductions accumulator
    public static double getTotalDeductions()
    {
        return totalDeductions;
    }

    // Method to add to the total net pay accumulator
    public static void totalNetPay(double netPay)
    {
        // Add net pay to the total net pay accumulator
        totalNetPay = totalNetPay + netPay;
    }
    
    // Method to return the total net pay accumulator
    public static double getTotalNetPay()
    {
        return totalNetPay;
    }
    
} // End of the class
// Copyright Material - Nancy S. Grant - All Rights Reserved