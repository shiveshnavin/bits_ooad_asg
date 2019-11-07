package bits.oad.ooad_asg.scrutiny;

import bits.oad.ooad_asg.Util;

public class ExternalPropertyApprovalSystem {
	
	public void approveRequest(ApprovalRequest ar)
	{
		System.out.println("ExternalPropertyApprovalSystem : Approved Property");
		ar.status=true;
	}

	private static ExternalPropertyApprovalSystem EPASys;
	public static ExternalPropertyApprovalSystem getInstance()
	{
		if(EPASys==null) EPASys = new ExternalPropertyApprovalSystem();
		return EPASys;
	}
	

}
