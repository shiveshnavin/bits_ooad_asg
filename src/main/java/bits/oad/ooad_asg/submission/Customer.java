package bits.oad.ooad_asg.submission;

import java.util.List;

import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.finance.LoanTermSheet;

public class Customer {
	
	int id;
	String name;
	List<Appartment> appartments;
	
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
