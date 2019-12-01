package bits.oad.ooad_asg.scrutiny;

import java.util.HashMap;

import bits.oad.ooad_asg.submission.PropertyDoc;

public class ExPropSystemAdapter {
	
HashMap<Integer,PropertyApprovalRequest> approvals = new HashMap<Integer, PropertyApprovalRequest>();



	private ExternalPropertyApprovalSystem sys;
	public ExPropSystemAdapter()
	{
		sys=ExternalPropertyApprovalSystem.getInstance();
	}

	public boolean checkPropertyPreApproval(PropertyDoc property)
	{
			return sys.checkPropertyPreApproval(property.getData());
	}
	
	public boolean makeApprovePropReq(PropertyDoc d)
	{
		
		PropertyApprovalRequest req=new PropertyApprovalRequest();
		req.setPdoc(d);

		sys.approvePropRequest(req);
		
		return req.getStatus();
		
	}

	private static ExternalPropertyApprovalSystem EPASys;
	public static ExternalPropertyApprovalSystem getInstance()
	{
		if(EPASys==null) EPASys = new ExternalPropertyApprovalSystem();
		return EPASys;
	}
	


}
