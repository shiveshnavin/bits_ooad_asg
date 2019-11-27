package bits.oad.ooad_asg.administration;

import bits.oad.ooad_asg.HousingLoanSystem;
import bits.oad.ooad_asg.finance.Loan;
import bits.oad.ooad_asg.scrutiny.LoanNotApprovedException;

public class Officer {
	
	public int officerId;
	public Loan loanToProcess;
	
	public Officer(Loan loanUnderProcess) {
		loanToProcess = loanUnderProcess;
	}

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
		if(!loanToProcess.getPropertyApprovalRequestStatus())
		{
			throw new LoanNotApprovedException("Property is not Approved");
		}
		System.out.println("Officer : Property Doc Approval..OK ");

	}
	
	public void checkFinDocValidity() throws LoanNotApprovedException
	{
		System.out.println("Officer : check Financial Doc Validity");
		if(!loanToProcess.isFinDocValStatus())
		{
			throw new LoanNotApprovedException("Financial Docs are not Valid");
		}

		System.out.println("Officer : Financial Doc Approval..OK ");
		

	}
	
	public void checkCredValidity() throws LoanNotApprovedException
	{
		System.out.println("Officer : check Credit Validity");

		if(!loanToProcess.isCredValStatus())
		{
			throw new LoanNotApprovedException("Credit is not Valid");
		}
		System.out.println("Officer : Credit Validity..OK ");
	}

}
