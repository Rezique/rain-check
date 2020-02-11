package weather;

public class CirrusCloud extends Cloud
{	
	CirrusCloud(float bottom, float top) 
	{
		super(bottom, top);
	}

	@Override
	public String rain()
	{
		return "I cannot make rain";
	}
}
