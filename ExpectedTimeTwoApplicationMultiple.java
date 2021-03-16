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

public class ExpectedTimeTwoApplicationMultiple
{
    public static void main (String[] args) 
    {
        // Define the programmer-defined variables
        int    projectNumber;
        String projectName;
        int    optimisticTime;
        int    realisticTime;
        int    pessimisticTime;
        float  expectedTime;
        
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
           
           // Create an object (or instance) of the ExpectedTimeClassOne
           ExpectedTimeClassTwo expectedTimeObject = new 
                                ExpectedTimeClassTwo();
                            
           // Call the method to validate and obtain the project number
           projectNumber  =  validateAndGetProjectNumber();
           
           // Call the classes method to set the project number
           expectedTimeObject.setProjectNumber(projectNumber);
        
           // Call the method to validate and obtain the project name
           projectName    =  validateAndGetProjectName();
           
           // Call the classes method to set the project name
           expectedTimeObject.setProjectName(projectName);
        
           // Call the method to validate and obtain the optimistic time
           optimisticTime  =  validateAndGetOptimisticTime();
        
           // Call the classes method to set the optimistic time
           expectedTimeObject.setOptimisticTime(optimisticTime);
        
           // Call the method to validate and obtain the realistic time
           realisticTime = validateAndGetRealisticTime();
           
           // Call the classes method to set the realistic time
           expectedTimeObject.setRealisticTime(realisticTime);
        
           // Call the method to validate and obtain the pessimistic time
           pessimisticTime = validateAndGetPessimisticTime();
           
           // Call the classes method to set the pessimistic time
           expectedTimeObject.setPessimisticTime(pessimisticTime);

           // Call the classes method to calculate the expected time ****consider taking out
           expectedTime = expectedTimeObject.calculateExpectedTime();
           
           // Call the method to display the information
           // passing the object (argument) to the method 
           // as well as calculate the expected time and display it
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

           processObjects = Boolean.parseBoolean(inputData);

        } // End of while loop
      
      // Call the method to display the summary information
      displaySummaryInformation();
   } // End of main method
    
    // Method to obtain and return the project number
    public static int validateAndGetProjectNumber()
    {
        // Define the programmer-defined local variables
        String inputData;
        int projNumber;

        // Obtain the project number from the user
        inputData  = JOptionPane.showInputDialog(null,
                     "Enter the project number ");
                     
        // Convert inputData data into an integer
        projNumber = Integer.parseInt(inputData);

        // Validate the project number
        while ( projNumber < 1 || projNumber > 100 )
        {
           JOptionPane.showMessageDialog(null, 
           "The project number entered is not in an acceptable range.",
           "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                           
           inputData = JOptionPane.showInputDialog(null,
           "Please re-enter a value from 1 to 100 only ", "Error",
           JOptionPane.ERROR_MESSAGE);
                       
           projNumber = Integer.parseInt(inputData);
        }
        // Return the project number back to the main method
        return projNumber;
    }

    // Method to obtain and return the project name
    public static String validateAndGetProjectName()
    {
        // Define the programmer-defined local variable
        String projName;

        // Obtain the project name from the user
        projName    =  JOptionPane.showInputDialog(null,
                       "Enter the project name ");
        
        // Validate the project name
        while ( projName.isEmpty() )
        {
           JOptionPane.showMessageDialog(null, 
           "The project name cannot be empty.", "Invalid Entry",
           JOptionPane.WARNING_MESSAGE);
                           
           projName  = JOptionPane.showInputDialog(null,
           "Please re-enter a name for the project ", "Error",
           JOptionPane.ERROR_MESSAGE);
        }
        // Return the project name back to the main method
        return projName;
    }

    // Method to obtain and return the optimistic time 
    public static int validateAndGetOptimisticTime()
    {
        // Define the programmer-defined local variables
        int optTime;
        String inputData;
        
        // Obtain the optimistic time from the user
        inputData = JOptionPane.showInputDialog(null,
                    "Enter the optimistic time ");
                    
        // Convert the input data to an integer primitive data type
        optTime   = Integer.parseInt(inputData);

        // Validate the optimistic time
        while (optTime < 1 || optTime > 50)
        {
           JOptionPane.showMessageDialog(null, 
           "The optimistic time entered is not in an acceptable range.",
           "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                           
           inputData = JOptionPane.showInputDialog(null,
           "Please re-enter a value from 1 to 50 only ", "Error",
           JOptionPane.ERROR_MESSAGE);
           
           optTime   = Integer.parseInt(inputData);
        }
        // Return the optimistic time back to the main method
        return optTime;
    }

    // Method to obtain and return the realistic time
    public static int validateAndGetRealisticTime()
    {
        // Define the programmer-defined local variables
        int realTime;
        String inputData;

        // Obtain the realistic time from the user
        inputData = JOptionPane.showInputDialog(null, 
                    "Enter the realistic time ");

        // Convert the input data to an integer primitive data type
        realTime  = Integer.parseInt(inputData);

        // Validate the realistic time
        while (realTime < 1 || realTime > 60)
        {
           JOptionPane.showMessageDialog(null, 
           "The realistic time entered is not in an acceptable range.",
           "Invalid Entry", JOptionPane.WARNING_MESSAGE);

           inputData = JOptionPane.showInputDialog(null,
           "Please re-enter a value from 1 to 60 only ", "Error",
           JOptionPane.ERROR_MESSAGE);

           realTime  = Integer.parseInt(inputData);
        }
        // Return the realistic time back to the main method
        return realTime;
    }

    // Method to obtain and return the pessimistic time
    public static int validateAndGetPessimisticTime()
    {
        // Define the programmer-defined local variables
        int pessTime;
        String inputData;
        
        // Obtain the pessimistic time from the user
        inputData = JOptionPane.showInputDialog(null,
                    "Enter the pessimistic time ");

        // Convert the input data to an integer primitive data type
        pessTime  = Integer.parseInt(inputData);

        // Validate the pessimistic time
        while (pessTime < 1 || pessTime > 70)
        {
           JOptionPane.showMessageDialog(null, 
           "The pessimistic time entered is not in an acceptable range.",
           "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                           
           inputData = JOptionPane.showInputDialog(null,
           "Please re-enter a value from 1 to 70 only ", "Error",
           JOptionPane.ERROR_MESSAGE);
              
           pessTime  = Integer.parseInt(inputData);
        }
       // Return the pessimistic time back to the main method
       return pessTime;
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
                expectedTimeObject.getProjectNumber() + "\n"
                + "The Project Name     is " +
                expectedTimeObject.getProjectName() + "\n"
                + "The Optimistic Time  is " +
                expectedTimeObject.getOptimisticTime() + "\n"
                + "The Realistic Time   is " + 
                expectedTimeObject.getRealisticTime() + "\n"
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
                "The number of records processed is " + 
                (ExpectedTimeClassTwo.getTheCounter()) + "\n"
                + "The Smallest Expected Time is    " +
                formatOutput.format
                (ExpectedTimeClassTwo.getSmallestExpectedTime()) + "\n"
                + "The Largest Expected Time is       " +
                formatOutput.format
                (ExpectedTimeClassTwo.getLargestExpectedTime()));
    }
  
} // End of the class
// Copyright Material - Nancy S. Grant - All Rights Reserved