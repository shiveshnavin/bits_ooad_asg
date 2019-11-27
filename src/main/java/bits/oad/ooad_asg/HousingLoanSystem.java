package bits.oad.ooad_asg;

import bits.oad.ooad_asg.administration.AdminController;
import bits.oad.ooad_asg.administration.Officer;
import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.finance.Loan;
import bits.oad.ooad_asg.scrutiny.ExternalCreditApprovalSystem;
import bits.oad.ooad_asg.scrutiny.ExternalPropertyApprovalSystem;
import bits.oad.ooad_asg.scrutiny.LoanNotApprovedException;
import bits.oad.ooad_asg.scrutiny.PropertyApprovalRequest;
import bits.oad.ooad_asg.submission.PropertyDoc;

import java.util.ArrayList;
import java.util.List;

public class HousingLoanSystem {

	
	private Loan loanUnderProcess;
	public ArrayList<Loan> loans = new ArrayList<Loan>();
	private static HousingLoanSystem system; 

	private HousingLoanSystem() {}
	
	public static HousingLoanSystem getInstance()
	{
		if(system == null )
		{
			system = new HousingLoanSystem();
		}
		
		return system;
		
	}
	
	public Loan createLoan(int amount)
	{
		
		loanUnderProcess = new Loan(amount);
		loans.add(loanUnderProcess);
		return loanUnderProcess;
		
	}
	public Loan getLoanUnderProcess()
	{
		return loanUnderProcess;
	}
	public void setLoanUnderProcess(Loan loan)
	{
		loanUnderProcess = loan;
	}
	

	
	public boolean doApproval()
	{
		
		loanUnderProcess.setCredValStatus(createExternalCreditApprovalRequest());
		

		AdminController ac =new AdminController(loanUnderProcess);
		try
		{
			boolean status= ac.officerCheckLoan(); 
			ac.clerkFIlePropertyDocs();
			return status;
		}
		catch(LoanNotApprovedException e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	

	public boolean doVerification()
	{


		loanUnderProcess.setPropertyApprovalRequestStatus(checkPreApproval());;

		 
		AdminController ac =new AdminController(loanUnderProcess);
		boolean verified = ac.clerkVerifyFinDocs();
		loanUnderProcess.setFinDocValStatus(verified);;
		if(verified)
		System.out.println("Loan Verification Complete");

		return verified;
	}
	
	
	public boolean checkPreApproval()
	{
		boolean isOk = true;
		for(PropertyDoc d:loanUnderProcess.getPropertyDocs())
		{
			boolean isApproved = 
					ExternalPropertyApprovalSystem.getInstance().checkPropertyPreApproval(d.getData());
			if(!isApproved)
			{
				isApproved = createPropertyApprovalRequest(d);

			}
			isOk = isOk && isApproved;

		}
		return isOk;
		
		 
	}
	
	public boolean createPropertyApprovalRequest(PropertyDoc d)
	{
		PropertyApprovalRequest req=new PropertyApprovalRequest();
		req.setPdoc(d);
		ExternalPropertyApprovalSystem.getInstance().approvePropRequest(req);
		
		return req.getStatus();
	}
	
	public boolean createExternalCreditApprovalRequest()
	{
		return ExternalCreditApprovalSystem.getInstance().makeApprovalRequest(loanUnderProcess.getAmount());
	}
	 
	
	public void showDetails()
	{
		System.out.println("Loan initated Successfully ! Loan id = "+loanUnderProcess.getLoanId()+
				" :: Customer = "+loanUnderProcess.curCust.getName());
	}
	 

}
