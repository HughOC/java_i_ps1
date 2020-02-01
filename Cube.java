public class Cube
{
	//
	// Create our cube using the length:
	//
	private double length;
	public Cube( double lengthValue )
	{
		length = lengthValue;
	}
	
	//
	// Calculate the base area:
	//
	public double baseArea()
	{
		return length * length;
	}
	
	//
	// Calculate the surface area of the cube:
	//
	public double totalSurfaceArea()
	{
		return 6 * length * length;
	}
	
	//
	// Calculate the volume of the cube:
	//
	public double volume()
	{
		return length * length * length;
	}
	
	//
	// Calculate the length of the base diagonal:
	//
	public double lengthOfBaseDiagonal()
	{
		return Math.sqrt(Math.pow(length, 2) + Math.pow(length, 2));
	}
	
	//
	// Calculate the length of the body diagonal:
	//
	public double lengthOfBodyDiagonal()
	{
		return Math.sqrt(Math.pow(lengthOfBaseDiagonal(), 2) + Math.pow(length, 2));
	}
  
}
