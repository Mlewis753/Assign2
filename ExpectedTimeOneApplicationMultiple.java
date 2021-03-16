import javax.swing.JOptionPane; 
import java.text.DecimalFormat;

/*
 *
 * Objective:    This program uses the ExpectedTimeClassOne
 *               class to create and process multiple objects 
 *
 *
 *
 * Author:       Your Name
 *
 * Date:         Current Date
 *
 *
*/

public class ExpectedTimeOneApplicationMultiple
{
    public static void main (String[] args) 
    {
        // Define the programmer-defined variables
        int    pNumber;
        String pName;
        int    optTime;
        int    realTime;
        int    pessTime;
        
        // Define a programmer-defined variable to hold input data
        String inputData;
        
        // Define a programmer-defined variable to handle the program iteration
        boolean processObjects = true;
        
        // Prompt the user if they would like to run the program
        inputData      = JOptionPane.showInputDialog(null,
                         "Would you like to execute the program\n"
                         + " Type true for yes or false for no ");
        processObjects  = Boolean.parseBoolean(inputData);
        
        // while loop to process multiple objects
        while (processObjects)
        {
         
           // Call the method to validate and obtain the project number
           pNumber =  validateAndGetProjectNumber();
        
           // Call the method to validate and obtain the project name
           pName   =  validateAndGetProjectName();
        
           // Call the method to validate and obtain the optimistic time
           optTime =  validateAndGetOptimisticTime();
        
           // Call the method to validate and obtain the realistic time
           realTime = validateAndGetRealisticTime();
        
           // Call the method to validate and obtain the pessimistic time
           pessTime = validateAndGetPessimisticTime();
        
           // Create an object (or instance) of the ExpectedTimeClassOne
           ExpectedTimeClassOne expectedTimeObject = new 
                                ExpectedTimeClassOne(pNumber,
                                                     pName,
                                                     optTime,
                                                     realTime,
                                                     pessTime);
       
           // Call the method to display the information
           // passing the object (argument) to the method 
           // as well as calculate the expected time and display it
           displayDetailInformation(expectedTimeObject);
        
           // Prompt the user if they want to run the program again
           inputData      = JOptionPane.showInputDialog(null,
                            "Would you like to execute the program again\n"
                            + " Type true for yes or false for no ");

           processObjects = Boolean.parseBoolean(inputData);

        } // End of while loop                    
                         
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
    public static void displayDetailInformation(ExpectedTimeClassOne
                                                expectedTimeObject) 
    {
        // Format the output
        DecimalFormat formatOutput = new DecimalFormat("#####.00");

        // Display the information for the project to the user
        JOptionPane.showMessageDialog(null,
                "The Project Number     is " + 
                expectedTimeObject.getProjectNumber()+ "\n"
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

} // End of the class
// Copyright Material - Nancy S. Grant - All Rights Reserved