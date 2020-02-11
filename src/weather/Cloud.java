package weather;

public class Cloud 
{
	// Instance Variables
	private float top;
	private float bottom;
	
	Cloud(float bottom, float top) // 
	{
		this.top = top;
		this.bottom = bottom;
	}
	
	public float getHeight()
	{
		return top - bottom;
	}
	
	public String rain()
	{
		return "It is raining";
	}
}
