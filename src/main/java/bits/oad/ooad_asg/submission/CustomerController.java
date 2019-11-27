package bits.oad.ooad_asg.submission;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;

import antlr.collections.List;
import bits.oad.ooad_asg.HousingLoanSystemExpert;
import bits.oad.ooad_asg.Util;
import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.finance.Loan;
import bits.oad.ooad_asg.finance.LoanTermSheet;

@Controller
public class CustomerController {
	

	public void initiateLoan(int amount)
	{
		// Entry Point Here
		HousingLoanSystemExpert.curLoan=new Loan(amount);
		
	}

	public void saveCustomer(Customer curCust)
	{
		// Entry Point Here
		HousingLoanSystemExpert.curLoan.curCust = curCust;
		HousingLoanSystemExpert.curLoan.setLoanId( Util.getInstance().newId() );
		
	}
	
	public void uploadFinancialDoc(FinancialDoc doc)
	{
		ArrayList<FinancialDoc>  lst =
				(ArrayList<FinancialDoc>) HousingLoanSystemExpert.curLoan.getFinancialDocs();
		if(lst == null)
		{
			lst = new ArrayList<FinancialDoc>();
		}

		lst.add(doc);
		
		HousingLoanSystemExpert.curLoan.setFinancialDocs(lst);
		 
	}

	public void uploadPropertyDoc(PropertyDoc doc)
	{
		ArrayList<PropertyDoc>  lst1 =
				(ArrayList<PropertyDoc>) HousingLoanSystemExpert.curLoan.getPropertyDocs();
		if(lst1 == null)
		{
			lst1 = new ArrayList<PropertyDoc>();
		}

		lst1.add(doc);
		
		HousingLoanSystemExpert.curLoan.setPropertyDocs(lst1);
	}

	public void acceptTermSheet(LoanTermSheet sheet)
	{
		sheet.markAccepted();
	}


}
