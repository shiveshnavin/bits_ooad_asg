package bits.oad.ooad_asg.scrutiny;

import bits.oad.ooad_asg.submission.PropertyDoc;

public class PropertyApprovalRequest {
	
	int id;
	long dateTime;
	PropertyDoc pdoc;
	public PropertyDoc getPdoc() {
		return pdoc;
	}

	public void setPdoc(PropertyDoc pdoc) {
		this.pdoc = pdoc;
	}

	private boolean status;
	
	public boolean getStatus()
	{
		return isStatus();
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
