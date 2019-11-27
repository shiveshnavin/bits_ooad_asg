package bits.oad.ooad_asg.scrutiny;

import java.util.HashMap;

import bits.oad.ooad_asg.Util;
import bits.oad.ooad_asg.submission.PropertyDoc;

public class ExternalPropertyApprovalSystem {

	HashMap<Integer,PropertyApprovalRequest> approvals = new HashMap<Integer, PropertyApprovalRequest>();
	
	
	public HashMap<Integer, PropertyApprovalRequest> getApprovals() { 
		return approvals;
	}
 
	public boolean checkPropertyPreApproval(String property)
	{
		if(approvals.containsKey(property))
		{

			System.out.println("ExternalPropertyApprovalSystem : Already Approved Property "+property);
			return approvals.get(property).getStatus();
		}
		
		return false;
	}
	
	public void approvePropRequest(PropertyApprovalRequest ar)
	{
		
		System.out.println("ExternalPropertyApprovalSystem : Property approval processsing for "+ar.getPdoc().getData()+" ..DONE");
		approvals.put(ar.getPdoc().getId(),ar);
		if(ar.getPdoc().getData().contains("restricted"))
		{
			ar.setStatus(false);
		}
		else
		{
			ar.setStatus(true);
		}
		
	}

	private static ExternalPropertyApprovalSystem EPASys;
	public static ExternalPropertyApprovalSystem getInstance()
	{
		if(EPASys==null) EPASys = new ExternalPropertyApprovalSystem();
		return EPASys;
	}
	

}
