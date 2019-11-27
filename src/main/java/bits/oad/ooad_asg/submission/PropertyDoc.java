package bits.oad.ooad_asg.submission;

import bits.oad.ooad_asg.Util;

public class PropertyDoc {
	
	public int getId() {
		return id;
	}
	public String getData() {
		return data;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PropertyDoc(String data) {
		super();
		id=Util.getInstance().newId();
		this.data = data;
	}
	int id;
	String data;

}
