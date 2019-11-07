package bits.oad.ooad_asg.administration;

public class Officer {
	
	public int officerId;
	
	public boolean approveLoan()
	{
		System.out.println("Officer : approve Loan");

		return true;
	}
	
	public void checkPropertyApproval()
	{
		System.out.println("Officer : check Property Approval");

	}
	
	public void checkFinDocValidity()
	{
		System.out.println("Officer : check Financial Doc Validity");

	}
	
	public void checkCredValidity()
	{
		System.out.println("Officer : check Credit Validity");

	}

}
