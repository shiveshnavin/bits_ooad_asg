package bits.oad.ooad_asg.administration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bits.oad.ooad_asg.HousingLoanSystem;
import bits.oad.ooad_asg.finance.Loan;
import bits.oad.ooad_asg.scrutiny.LoanNotApprovedException;

@Controller
public class AdminController {
	

	Officer officer;
	Clerk clerk; 
	Loan curLoan;
	public AdminController(Loan curLoan)
	{
		this.curLoan=curLoan;
		officer = new Officer(curLoan);
		clerk = new Clerk();
	}
	
	@RequestMapping(path = "/api/officer/checkloan")
	public boolean officerCheckLoan() throws LoanNotApprovedException
	{

		return officer.checkLoan();
	}
	
	@RequestMapping(path = "/api/officer/approveloan")
	public void officerApproveLoan()
	{
		officer.approveLoan();
	}
	
	
	@RequestMapping(path = "/api/clerk/verifydocs")
	public boolean clerkVerifyFinDocs()
	{ 
		boolean isValid = clerk.verifyFinDoc(curLoan.getFinancialDocs());
	 
		System.out.println("Fin Docs are : "+(isValid?"Valid":"Invalid")+ " for loan "+curLoan.getLoanId());
		return isValid;
	
	}
	

	@RequestMapping(path = "/api/clerk/filepropertydocs")
	public void clerkFIlePropertyDocs()
	{ 
		clerk.filePropertyDocs();
	}
	
	

}
