package bits.oad.ooad_asg.administration;

import bits.oad.ooad_asg.HousingLoanSystemExpert;
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
		System.out.println("Officer : Tada !  Loan Approved");

		return true;
	}
	
	public void checkPropertyApproval() throws LoanNotApprovedException
	{
		System.out.println("Officer : check Property Approval");
		if(!HousingLoanSystemExpert.curLoan.getPropertyApprovalRequest().getStatus())
		{
			throw new LoanNotApprovedException("Property is not Approved");
		}

	}
	
	public void checkFinDocValidity() throws LoanNotApprovedException
	{
		System.out.println("Officer : check Financial Doc Validity");
		if(!HousingLoanSystemExpert.curLoan.isFinDocValStatus())
		{
			throw new LoanNotApprovedException("Financial Docs are not Valid");
		}
		
		

	}
	
	public void checkCredValidity() throws LoanNotApprovedException
	{
		System.out.println("Officer : check Credit Validity");
		if(!HousingLoanSystemExpert.curLoan.isCredValStatus())
		{
			throw new LoanNotApprovedException("Credit is not Valid");
		}
	}

}
