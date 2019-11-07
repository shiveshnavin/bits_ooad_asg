package bits.oad.ooad_asg.scrutiny;

public class PropertyApprovalRequest {
	
	int id;
	long dateTime;
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
