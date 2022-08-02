package frc.robot;

import java.util.Arrays;
import java.util.List;

import frc.robot.subsystems.Subsystem;

public final class Manager {

    /** Robot manager that is accessible across all classes */
    private static Manager manager = null;
    
    private List<Subsystem> mSubsystems;



    /**
     * Returns instance of manager
     * 
     * @return the manager instance
     * 
     */
    public static Manager getManager() {
        // If singleton does not exist, creates one
        if(manager == null) {
            manager = new Manager();
        }
        return manager;
    }

    /** Constructor for manager class */
    public Manager() {

    }
    
    /**
     * 
     * Sets the member list of subsystems to the parameter pSubsystems. 
     * Must be called at the beginning of RobotInit.
     * 
     * @param pSubsystems
     */
    public void setSubsystems(Subsystem... pSubsystems) {
        mSubsystems = Arrays.asList(pSubsystems);
    }


}