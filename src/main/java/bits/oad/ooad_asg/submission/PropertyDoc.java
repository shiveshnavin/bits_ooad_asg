package bits.oad.ooad_asg.submission;

import bits.oad.ooad_asg.Util;

public class PropertyDoc {
	
	public PropertyDoc(String data) {
		super();
		id=Util.getInstance().newId();
		this.data = data;
	}
	int id;
	String data;

}
