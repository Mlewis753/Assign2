/*
 *
 * Objective:    The objective of the program is to define
 *               the ExpectedTimeClassOne Class with the private
 *               data members, constructors, as well as  
 *               all of the methods needed for the class
 * 
 *
 * Author:       Your Name
 *
 * Date:         Current Date
 *
*/
 
public class ExpectedTimeClassOne
{
    // Data Members (or fields) for the class
    private int    projectNumber;
    private String projectName;
    private int    optimisticTime;
    private int    realisticTime;
    private int    pessimisticTime;

    // This is the default constructor (no-argument)
    public ExpectedTimeClassOne() 
    {
        projectNumber   = 1;
        projectName     = "Project One";
        optimisticTime  = 4;
        realisticTime   = 7;
        pessimisticTime = 9;

    }

    // Constructor
    public ExpectedTimeClassOne(int pNumber,
                                String pName,
                                int optTime,
                                int realTime,
                                int pessTime) 
    {
        projectNumber   = pNumber;
        projectName     = pName;
        optimisticTime  = optTime;
        realisticTime   = realTime;
        pessimisticTime = pessTime;
    }

    // Mutator method to set the project number
    public void setProjectNumber(int pNumber) 
    {
        projectNumber = pNumber;
    }

    // Accessor method to get the project number
    public int getProjectNumber() 
    {
        return projectNumber;
    }

    // Mutator method to set the project name
    public void setProjectName(String pName) 
    {
        projectName = pName;
    }

    // Accessor method to get the project name
    public String getProjectName() 
    {
        return projectName;
    }

    // Mutator method to set the optimistic time    
    public void setOptimisticTime(int optTime) 
    {
        optimisticTime = optTime;
    }

    // Accessor method to get the optimistic time
    public int getOptimisticTime() 
    {
        return optimisticTime;
    }

    // Mutator method to set the realistic time
    public void setRealisticTime(int realTime) 
    {
        realisticTime = realTime;
    }

    // Accessor method to get the realistic time
    public int getRealisticTime() 
    {
        return realisticTime;
    }

    // Mutator method to set the pessimistic time    
    public void setPessimisticTime(int pessTime) 
    {
        pessimisticTime = pessTime;
    }

    // Accessor method to get the pessimistic time
    public int getPessimisticTime() 
    {
        return pessimisticTime;
    }

    // Class method to calculate and return the expected time
    public float calculateExpectedTime() 
    {
        // Calculate the expected time
        float expectedTime = (optimisticTime + (4.0f * realisticTime)
                              + pessimisticTime) / 6.0f;
        return expectedTime;
    }

} // End of the class 
// Copyright Material - Nancy S. Grant - All Rights Reserved