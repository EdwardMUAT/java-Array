// Create our main class for the Mars Base Energy Grid for this project
public class MarsBaseEnergyGrid {
    // Create the starting point for our program which will always be the main method
    public static void main(String[] args) {
        // display a title to our user
        System.out.println("\n\n*** Welcome to the Mars Base Energy Grid ***\n\n");

        // Create our first array and then initialize it with values
        // Create our solar panel array in Megawatts (MW)
        int[] solarPanels = {30, 45, 25, 35, 50};

        // Create our second array and then initialize it with values
        // Create our wind turbine array in MegaWatts (MW)
        int[] windTurbines = {20, 30, 24, 40, 35};

        // Create a variable to store our total energy output we got from our solar panels
        int totalSolarEnergy = 0;

        // Create a loop to iterate through our solar panels to calculate the total energy output from our solar panels
        // This solarPanels.length calculates the length of our array
        for(int i = 0; i < solarPanels.length; i++){
            // Add the current solar panel element to our total solar energy
            totalSolarEnergy = totalSolarEnergy + solarPanels[i];
            System.out.println("The current solar #" + i + "panel element is: " + solarPanels[i] + " MW");
            // Display the current total solar energy to out user
            System.out.println(" The current total solar energy is: " + totalSolarEnergy + " MW\n");
        }

        // Create a variable to store our total energy output we get from all of our wind turbines
        // We are initializing this variable to 0 because we have not calculated the total energy output yet
        int totalWindEnergy = 0;

        // Create a loop to iterate through our wind turbines to calculate the total energy output of all our wind turbines
        // This windTurbines.length calculates the length of our array
        // This type of loop will be a for loop. We will learn other types of loops later in the course
        for(int i = 0; i < windTurbines.length; i++){
            // add the current wind turbine element from our array to our total wind energy variable
            totalWindEnergy =  totalWindEnergy + windTurbines[i];
        }

        // Create a variable to store our total energy output for our entire energy grid
        // We are initializing this variable to 0 because we have not calculated the total energy output yet
        int totalEnergyFromAllSources = 0;
        // Calculate our total energy output from all of our sources
        totalEnergyFromAllSources = totalSolarEnergy + totalWindEnergy;

        // Report the energy output for our user
        System.out.println("\n\n>>>The Energy Report for our Mars Base Alpha Energy Grid is as follows:\n\n");
        // Display the total energy for our solar panels
        System.out.println("The total energy output for all of our solar panels is: "  + totalSolarEnergy +" MW\n\n");
        // Display the total energy output for our wind turbines
        System.out.println("The total energy output for all of our wind turbines is: " + totalWindEnergy + " MW\n\n");
        // Display the total energy output for our entire energy grid from all sources
        System.out.println("The total energy output for our entire energy grid from all collection sources is: " + totalEnergyFromAllSources +  " MW\n\n");

        // Display end of the report
        System.out.println("\n\n>>> End of Energy Report for our Mars Base Alpha Energy Grid\n\n");

        // Say goodbye to our user
        System.out.println("\n\n*** Thank you for using the Mars Base Energy Grid ***\n\n");
    }
}
