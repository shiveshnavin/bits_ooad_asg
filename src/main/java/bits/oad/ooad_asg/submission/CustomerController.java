package bits.oad.ooad_asg.submission;

import org.springframework.stereotype.Controller;

import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.finance.LoanTermSheet;

@Controller
public class CustomerController {
	

	public void initiateLoan(int amount)
	{
		// Entry Point Here
	}
	
	public void uploadFinancialDoc(FinancialDoc doc)
	{
		
	}

	public void uploadPropertyDoc(PropertyDoc doc)
	{
		
	}

	public void acceptTermSheet(LoanTermSheet sheet)
	{
		sheet.markAccepted();
	}


}
