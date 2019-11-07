package bits.oad.ooad_asg.scrutiny;

public class ExternalCreditApprovalSystem {

	public boolean getApproval(float f)
	{
		System.out.println("ExternalCreditApprovalSystem : Approved");
		return true;
	}

	private static ExternalCreditApprovalSystem ECASys;
	public static ExternalCreditApprovalSystem getInstance()
	{
		if(ECASys==null) ECASys = new ExternalCreditApprovalSystem();
		return ECASys;
	}
	
}
