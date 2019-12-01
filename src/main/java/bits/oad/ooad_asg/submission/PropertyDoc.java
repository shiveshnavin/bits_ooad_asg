package bits.oad.ooad_asg.submission;

import bits.oad.ooad_asg.Util;

public class PropertyDoc extends Doccument{
	
	public int getId() {
		return docId;
	}
 
	public PropertyDoc(String data) {
		super();
		docId=Util.getInstance().newId();
		this.data = data;
	}
	 

}
