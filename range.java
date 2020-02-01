//
// A calculation of the horizontal distance travelled by a bullet fired from a gun. The gun
// is held at different angles from the horizontal and fired with different speeds for each
// of these angles. The results are displayed in a table.
//

public class range

{
	public static void main(String[] args) 
	{
		
		//
		// Initialise the variables and create a title for our table of values. We use asterisks to give the 
		// table structure:
		//
		int speed, angle;
		double range;
		String formattedTitle = String.format("* %1$s * %2$s *       %3$s      *\n", "Speed(m/s)", "Angle(degrees)", 
				"Range(m)");
		System.out.println("*****************************************************");
		System.out.printf(formattedTitle);
		System.out.println("*****************************************************");
		//
		// For each speed, we iterate over the different angles:
		//
		for (speed = 80; speed <= 140; speed += 20) 
		{
    		for (angle = 15; angle <= 75; angle += 15) 
    		{
    			range = speed * speed * Math.sin(2 * Math.toRadians(angle)) / 9.8;
    			String formattedString = String.format("*    %3d     *       %2d       *     %9.2f       *\n", speed, 
    					angle, range);
    			System.out.printf(formattedString);  
      		}
    	}
    	{
    	System.out.println("*****************************************************");
    	}
	}
}

