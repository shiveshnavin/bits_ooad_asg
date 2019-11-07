package bits.oad.ooad_asg.administration;

import bits.oad.ooad_asg.HousingLoanSystem;
import bits.oad.ooad_asg.scrutiny.LoanNotApprovedException;

public class Officer {
	
	public int officerId;
	
	public boolean checkLoan() throws LoanNotApprovedException
	{
		checkPropertyApproval();
		checkFinDocValidity();
		checkCredValidity();
		
		return approveLoan();
	}
	
	public boolean approveLoan()
	{
		System.out.println("Officer : Tada ! approve Loan");

		return true;
	}
	
	public void checkPropertyApproval() throws LoanNotApprovedException
	{
		System.out.println("Officer : check Property Approval");
		if(!HousingLoanSystem.curLoan.getPropertyApprovalRequest().getStatus())
		{
			throw new LoanNotApprovedException("Property is not Approved");
		}

	}
	
	public void checkFinDocValidity() throws LoanNotApprovedException
	{
		System.out.println("Officer : check Financial Doc Validity");
		if(!HousingLoanSystem.curLoan.isFinDocValStatus())
		{
			throw new LoanNotApprovedException("Financial Docs are not Valid");
		}
		
		

	}
	
	public void checkCredValidity() throws LoanNotApprovedException
	{
		System.out.println("Officer : check Credit Validity");
		if(!HousingLoanSystem.curLoan.isCredValStatus())
		{
			throw new LoanNotApprovedException("Credit is not Valid");
		}
	}

}
