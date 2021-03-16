/*
 *
 * Objective:    The objective of the program is to define
 *               the ExpectedTimeClassTwo with the private
 *               data members, constructors, as well as  
 *               all of the methods needed for the class.
 *
 *
 * Author:       Your Name
 *
 * Date:         Current Date
 *
*/

public class ExpectedTimeClassTwo 
{
    // Data members (or fields) for the class
    private int    projectNumber;
    private String projectName;
    private int    optimisticTime;
    private int    realisticTime;
    private int    pessimisticTime;

    // Define programmer-defined static counter
    public static int numberOfObjects = 0;
    
    // Define the programmer-defined static variables to find smallest
    // and largest expected times
    public static float smallestExpectedTime =  9999.99f;
    public static float largestExpectedTime  = -9999.99f;
    
    // This is the default constructor (no-argument)
    public ExpectedTimeClassTwo()
    {
        projectNumber   = 0;
        projectName     = null;
        optimisticTime  = 0;
        realisticTime   = 0;
        pessimisticTime = 0;
        
    }
    
    // Constructor
    public ExpectedTimeClassTwo(int    projectNumber,
                                String projectName, 
                                int    optimisticTime, 
                                int    realisticTime, 
                                int    pessimisticTime)
    {
        this.projectNumber   = projectNumber;
        this.projectName     = projectName;
        this.optimisticTime  = optimisticTime;
        this.realisticTime   = realisticTime;
        this.pessimisticTime = pessimisticTime;
    }
    
    // Mutator method to set the project number
    public void setProjectNumber(int projectNumber)
    {
        this.projectNumber = projectNumber;
    }
    
    // Accessor method to get the project number
    public int getProjectNumber()
    {
        return projectNumber;
    }

    // Mutator method to set the project name
    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }
    
    // Accessor method to get the project name
    public String getProjectName()
    {
        return projectName;
    }
    
    // Mutator method to set the optimistic time
    public void setOptimisticTime(int optimiticTime)
    {
        this.optimisticTime = optimisticTime;
    }
    
    // Accessor method to get the optimistic time
    public int getOptimisticTime()
    {
        return optimisticTime;
    }
    
    // Mutator method to set the realistic time
    public void setRealisticTime(int realisticTime)
    {
        this.realisticTime = realisticTime;
    }
    
    // Accessor method to get the realistic time
    public int getRealisticTime()
    {
        return realisticTime;
    }
    
    // Mutator method to set the pessimistic time
    public void setPessimisticTime(int pessimisticTime)
    {
        this.pessimisticTime = pessimisticTime;
    }
    
    // Accessor method to get the pessimistic time
    public int getPessimisticTime()
    {
        return pessimisticTime;
    }
    
    // Class method to calculate and return the expected time
    public float calculateExpectedTime()
    {
        // Define a local programmer-defined variable
        float expectedTime;

        // Calculate the expected time
        expectedTime = (optimisticTime + ( 4.0f * realisticTime ) 
                        + pessimisticTime) / 6.0f;
        return expectedTime;
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
        
    // Method to find the smallest expected time
    public static void findSmallestExpectedTime(float expectedTime)
    { 
        // Logic for finding the smallest expected time
        if (expectedTime < smallestExpectedTime)
            smallestExpectedTime = expectedTime;
    }
    
    // Method to return the smallest expected time
    public static float getSmallestExpectedTime()
    {
        return smallestExpectedTime;
    }

    // Method to find the largest expected time 
    public static void findLargestExpectedTime(float expectedTime)
    { 
        // Logic for finding the largest expected time
        if (expectedTime > largestExpectedTime)
            largestExpectedTime = expectedTime;
    }
    
    // Method to return the largest expected time
    public static float getLargestExpectedTime()
    {
        return largestExpectedTime;
    }
    
} // End of the class 
// Copyright Material - Nancy S. Grant - All Rights Reserved