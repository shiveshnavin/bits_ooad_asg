package bits.oad.ooad_asg.administration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bits.oad.ooad_asg.HousingLoanSystemExpert;
import bits.oad.ooad_asg.scrutiny.LoanNotApprovedException;

@Controller
public class AdminController {
	
	
	Officer officer;
	Clerk clerk;
	
	@RequestMapping(path = "/api/officer/checkloan")
	public void officerCheckLoan() throws LoanNotApprovedException
	{
		officer.checkLoan();
	}
	
	@RequestMapping(path = "/api/officer/approveloan")
	public void officerApproveLoan()
	{
		officer.approveLoan();
	}
	
	
	@RequestMapping(path = "/api/clerk/verifydocs")
	public void clerkVerifyDocs()
	{
		clerk.verifyDoc(HousingLoanSystemExpert.curLoan.getFinancialDocs());
	}
	

	@RequestMapping(path = "/api/clerk/filepropertydocs")
	public void clerkFIlePropertyDocs()
	{
		clerk.filePropertyDocs(HousingLoanSystemExpert.curLoan.getPropertyDocs());
	}
	
	

}
