package bits.oad.ooad_asg;

import bits.oad.ooad_asg.administration.Officer;
import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.finance.Loan;
import bits.oad.ooad_asg.scrutiny.ExternalCreditApprovalSystem;
import bits.oad.ooad_asg.scrutiny.ExternalPropertyApprovalSystem;
import bits.oad.ooad_asg.scrutiny.LoanNotApprovedException;
import bits.oad.ooad_asg.scrutiny.PropertyApprovalRequest;

import java.util.List;

public class HousingLoanSystem {

	public static Loan curLoan;
	
	HousingLoanSystem() {}
	
	public boolean doApproval()
	{
		curLoan.setCredValStatus(ExternalCreditApprovalSystem.getInstance().getApproval(curLoan.getAmount()));
		Officer officer = new Officer();
		try
		{
			return officer.checkLoan();
		}
		catch(LoanNotApprovedException e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public void checkPreApproval()
	{
		
	}
	
	public void createPropertyApprovalRequest()
	{
		
	}
	
	public void createExternalCreditApprovalRequest()
	{
		
	}
	
	public List<FinancialDoc> getFinancialDocs(Loan loan)
	{
		return null;
		
	}
	
	public void showDetails()
	{
		
	}
	
	public static void main(String[] args) {

		

	}

}
