import javax.swing.JOptionPane; 
import java.text.DecimalFormat;
 
/*
 *
 * Objective:    This program uses the ExpectedTimeClassTwo 
 *               class to process multiple objects.  The
 *               program also counts the number of objects
 *               created and finds the smallest, as well as
 *               the largest expected time.
 *
 *
 * Author:       Your Name
 *
 * Date:         Current Date
 *
 *
*/

public class ExpectedTimeTwoApplicationRewrite
{
    public static void main (String[] args) 
    {
        // Define the programmer-defined variable for the
        // expected time calculation
        float  expectedTime;
        
        // Define a programmer-defined variable to hold input data
        String inputData;
        
        // Define a programmer-defined variable to handle the program iteration
        boolean processRecords = true;
        
        // Prompt the user if they would like to run the program
        inputData      = JOptionPane.showInputDialog(null,
                         "Would you like to execute the program\n"
                         + " Type true for yes or false for no ");
        processRecords = Boolean.parseBoolean(inputData);
        
        // while loop to process multiple records
        while (processRecords)
        {
           // Create an object (or instance) of the ExpectedTimeClassTwo
           ExpectedTimeClassTwo expectedTimeObject = new 
                                ExpectedTimeClassTwo();

           // Call the method to validate and obtain the input data
           // passing the reference object (argument) to the method
           validateAndGetInputData(expectedTimeObject);
           
           // Call the classes method to calculate the expected time
           expectedTime = expectedTimeObject.calculateExpectedTime();
           
           // Call the method to display the information
           // passing the object (argument) to the method 
           displayDetailInformation(expectedTimeObject);

           // Call the classes method to add to the counter
           ExpectedTimeClassTwo.addToCounter();
           
           // Call the classes method to find the smallest expected time
           ExpectedTimeClassTwo.findSmallestExpectedTime(expectedTime);
           
           // Call the classes method to find the largest expected time
           ExpectedTimeClassTwo.findLargestExpectedTime(expectedTime);
           
           // Prompt the user if they want to run the program again
           inputData      = JOptionPane.showInputDialog(null,
                            "Would you like to execute the program again\n"
                            + " Type true for yes or false for no ");

           processRecords = Boolean.parseBoolean(inputData);

        } // End of while loop
      
      // Call the method to display the summary information
      displaySummaryInformation();
    } // End of main method
    
    // Method to validate and obtain the input data to build the object's contents
    public static void validateAndGetInputData(ExpectedTimeClassTwo
                                               expectedTimeObject)
    {
        // Define the programmer-defined local variables
        String inputData;
        int    projectNumber;
        String projectName;
        int    optimisticTime;
        int    realisticTime;
        int    pessimisticTime;

        // Obtain the project number from the user
        inputData  = JOptionPane.showInputDialog(null,
                     "Enter the project number ");
                     
        // Convert inputData data into an integer
        projectNumber = Integer.parseInt(inputData);

        // Validate the project number
        while ( projectNumber < 1 || projectNumber > 100 )
        {
           JOptionPane.showMessageDialog(null, 
           "The project number entered is not in an acceptable range.",
           "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                           
           inputData = JOptionPane.showInputDialog(null,
           "Please re-enter a value from 1 to 100 only ", "Error",
           JOptionPane.ERROR_MESSAGE);
                       
           projectNumber = Integer.parseInt(inputData);
        }
        // Call the classes method to set the project number
        expectedTimeObject.setProjectNumber(projectNumber);
    
        // Obtain the project name from the user
        projectName    =  JOptionPane.showInputDialog(null,
                       "Enter the project name ");
        
        // Validate the project name
        while ( projectName.isEmpty() )
        {
           JOptionPane.showMessageDialog(null, 
           "The project name cannot be empty.", "Invalid Entry",
           JOptionPane.WARNING_MESSAGE);
                           
           projectName  = JOptionPane.showInputDialog(null,
           "Please re-enter a name for the project ", "Error",
           JOptionPane.ERROR_MESSAGE);
        }
        // Call the classes method to set the project Name
        expectedTimeObject.setProjectName(projectName);

        // Obtain the optimistic time from the user
        inputData = JOptionPane.showInputDialog(null,
                    "Enter the optimistic time ");
                    
        // Convert the input data to an integer primitive data type
        optimisticTime   = Integer.parseInt(inputData);

        // Validate the optimistic time
        while (optimisticTime < 1 || optimisticTime > 50)
        {
           JOptionPane.showMessageDialog(null, 
           "The optimistic time entered is not in an acceptable range.",
           "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                           
           inputData = JOptionPane.showInputDialog(null,
           "Please re-enter a value from 1 to 50 only ", "Error",
           JOptionPane.ERROR_MESSAGE);

           optimisticTime   = Integer.parseInt(inputData);
        }
        // Call the classes method to set the optimistic time
        expectedTimeObject.setOptimisticTime(optimisticTime);

        // Obtain the realistic time from the user
        inputData = JOptionPane.showInputDialog(null,
                    "Enter the realistic time ");

        // Convert the input data to an integer primitive data type
        realisticTime  = Integer.parseInt(inputData);

        // Validate the realistic time
        while (realisticTime < 1 || realisticTime > 60)
        {
           JOptionPane.showMessageDialog(null, 
           "The realistic time entered is not in an acceptable range.",
           "Invalid Entry", JOptionPane.WARNING_MESSAGE);

           inputData = JOptionPane.showInputDialog(null,
           "Please re-enter a value from 1 to 60 only ", "Error",
           JOptionPane.ERROR_MESSAGE);

           realisticTime  = Integer.parseInt(inputData);
        }
        // Call the classes method to set the realistic time
        expectedTimeObject.setRealisticTime(realisticTime);

        // Obtain the pessimistic time from the user
        inputData = JOptionPane.showInputDialog(null,
                    "Enter the pessimistic time ");

        // Convert the input data to an integer primitive data type
        pessimisticTime  = Integer.parseInt(inputData);

        // Validate the pessimistic time
        while (pessimisticTime < 1 || pessimisticTime > 70)
        {
           JOptionPane.showMessageDialog(null, 
           "The pessimistic time entered is not in an acceptable range.",
           "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                           
           inputData = JOptionPane.showInputDialog(null,
           "Please re-enter a value from 1 to 70 only ", "Error",
           JOptionPane.ERROR_MESSAGE);
              
           pessimisticTime  = Integer.parseInt(inputData);
       }
       // Call the classes method to set the pessimistic time
       expectedTimeObject.setPessimisticTime(pessimisticTime);
    }

    // Method to display the information for the project to the user
    // accepting the object as a parameter to the method
    public static void displayDetailInformation(ExpectedTimeClassTwo
                                                expectedTimeObject) 
    {
        // Format the output
        DecimalFormat formatOutput = new DecimalFormat("#####.00");

        // Display the information for the project to the user
        JOptionPane.showMessageDialog(null,
                "The Project Number     is " + 
                expectedTimeObject.getProjectNumber()   + "\n"
                + "The Project Name     is " +
                expectedTimeObject.getProjectName()     + "\n"
                + "The Optimistic Time  is " +
                expectedTimeObject.getOptimisticTime()  + "\n"
                + "The Realistic Time   is " + 
                expectedTimeObject.getRealisticTime()   + "\n"
                + "The Pessimistic Time is " + 
                expectedTimeObject.getPessimisticTime() + "\n"
                + "The Expected Time    is " +
                formatOutput.format
                (expectedTimeObject.calculateExpectedTime()));
    }

    // Method to display the counter and the smallest and largest
    // expected times to the user
    public static void displaySummaryInformation()
    {
        // Format the output 
        DecimalFormat formatOutput = new DecimalFormat("#####.00");
    
        // Display the counter and the smallest and largest
        // expected time
        JOptionPane.showMessageDialog(null,
                "The number of records processed is "  + 
                (ExpectedTimeClassTwo.getTheCounter()) + "\n"
                + "The Smallest Expected Time is    "  +
                formatOutput.format
                (ExpectedTimeClassTwo.getSmallestExpectedTime()) + "\n"
                + "The Largest Expected Time is       " +
                formatOutput.format
                (ExpectedTimeClassTwo.getLargestExpectedTime()));
    }
    
} // End of the class
// Copyright Material - Nancy S. Grant - All Rights Reserved