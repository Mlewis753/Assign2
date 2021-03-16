/*
 * 
 * Objective:    The objective of the program is to define
 *               the PayrollClassOneModify class definition with
 *               the private data members, constants,
 *               constructors, as well as all of the methods
 *               needed for the class
 *             
 *             
 *             
 * Author:       Your Name
 *
 * Date:         Current Date
 *
*/

public class PayrollClassOneModify
{
    // Data Members (or fields) for the class
    private int    employeeNumber;
    private String employeeName;
    private double hoursWorked;
    private double rateOfPay;
    private double regularPay;
    private double overTimePay;
    private double grossPay;
    private double deductions;
    private double netPay;
        
    // Define programmer-defined static constants
    public final static double FEDERAL_TAX_RATE = 0.07;
    public final static double STATE_TAX_RATE   = 0.067;
    public final static double LOCAL_TAX_RATE   = 0.01;   

    // This is the default constructor (no-argument)
    public PayrollClassOneModify()
    {
        employeeNumber  = 1;
        employeeName    = "Test";
        hoursWorked     = 10.00;
        rateOfPay       = 25.00;
    }

    // Constructor 
    public PayrollClassOneModify(int    employeeNumber,
                                 String employeeName,
                                 double hoursWorked,
                                 double rateOfPay)
    {
        this.employeeNumber = employeeNumber;
        this.employeeName   = employeeName;
        this.hoursWorked    = hoursWorked;
        this.rateOfPay      = rateOfPay;
    }
    
    // Mutator Method to set the employee number
    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }
    
    // Accessor Method to get the employee number    
    public int getEmployeeNumber()
    {
        return employeeNumber;
    }
    
    // Mutator Method to set the employee name
    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }
  
    // Accessor Method to get the employee name
    public String getEmployeeName()
    {
        return employeeName;
    }

    // Mutator Method to set the hours worked
    public void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    
    // Accessor Method to get the hours worked    
    public double getHoursWorked()
    {
        return hoursWorked;
    }

    // Mutator Method to set the rate of pay
    public void setRateOfPay(float rateOfPay)
    {
        this.rateOfPay = rateOfPay;
    }
    
    // Accessor Method to get the rate of pay    
    public double getRateOfPay()
    {
        return rateOfPay;
    }
    
    // Method to calculate gross Pay
    public void calculateGrossPay()
    {
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
     }    
    
    public double getGrossPay()
    {
        // Method to return the gross pay
        return grossPay;
    }

    // Method to calculate the deductions
    public void calculateDeductions()
    {            
        // Define the programmer-defined local variables
        double federalTax;
        double stateTax;
        double localTax;
        
        // Calculate the deductions
        federalTax      = getGrossPay() * FEDERAL_TAX_RATE;
           
        stateTax        = getGrossPay() * STATE_TAX_RATE;
            
        localTax        = getGrossPay() * LOCAL_TAX_RATE;
            
        deductions      = federalTax + stateTax + localTax;
    }

    public double getDeductions()
    {
        // Method to return the deductions
        return deductions;
    }

    // Method to calculate net pay
    public void calculateNetPay()
    {
        // Calculate the net pay
        netPay          = getGrossPay() - getDeductions();
    }   

    public double getNetPay()
    {
        // Method to return the net pay
        return netPay;
    }
    
} // End of the class
// Copyright Material - Nancy S. Grant - All Rights Reserved