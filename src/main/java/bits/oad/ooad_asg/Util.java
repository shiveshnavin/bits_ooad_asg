package bits.oad.ooad_asg;

public class Util {

	private static Util util;
	public static Util getInstance()
	{
		if(util==null) util = new Util();
		return util;
	}
	
	
	public int newId(int min,int max)
	{
		return (int) ((Math.random() * ((max - min) + 1)) + min);
	}
	
	public int newId()
	{
		return newId(1,100);
	}
	
}
