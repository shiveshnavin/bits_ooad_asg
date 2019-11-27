package bits.oad.ooad_asg.finance;

import bits.oad.ooad_asg.Util;

public class FinancialDoc {
	
	public FinancialDoc(String data) {
		super();
		this.data = data;
		if(data.contains("invalid"))
		{
			isValid = false;
		}
		else
		{
			isValid = true;
		}
	}

	private int docId=Util.getInstance().newId();
	private String data;
	

	public boolean isValid = false;
	
	
	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}
	

}
