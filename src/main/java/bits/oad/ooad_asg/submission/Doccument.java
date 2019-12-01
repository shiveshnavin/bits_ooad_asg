package bits.oad.ooad_asg.submission;

import bits.oad.ooad_asg.Util;

public abstract class Doccument {
	


	public String getData() {
		return data;
	}
 
	protected int docId=Util.getInstance().newId();
	protected String data;

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

}
