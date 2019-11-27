package bits.oad.ooad_asg.scrutiny;

public class ExternalCreditApprovalSystem {

	
	public boolean makeApprovalRequest(float f)
	{
		if(f > 100000)
		{ 
			System.out.println("ExternalCreditApprovalSystem : Not Approved as amount > $100,000"); return false;
		}
		else
		{
			System.out.println("ExternalCreditApprovalSystem : Approved"); return true;
		}
		
	}

	private static ExternalCreditApprovalSystem ECASys;
	public static ExternalCreditApprovalSystem getInstance()
	{
		if(ECASys==null) ECASys = new ExternalCreditApprovalSystem();
		return ECASys;
	} 
}
