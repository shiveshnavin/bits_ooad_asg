package bits.oad.ooad_asg.submission;
 

import java.util.ArrayList;

import org.springframework.stereotype.Controller;

import antlr.collections.List;
import bits.oad.ooad_asg.HousingLoanSystem;
import bits.oad.ooad_asg.Util;
import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.finance.Loan;
import bits.oad.ooad_asg.finance.LoanTermSheet;

@Controller
public class CustomerController {
	

	DocumentFactory docf=new DocumentFactory();
	HousingLoanSystem system = HousingLoanSystem.getInstance();
	public void initiateLoan(int amount,String propDocData,String finDocData)
	{

		// Entry Point Here for Initate Use Case
		system.createLoan(amount);
		FinancialDoc fdoc =docf.createFinDoc(finDocData);
		uploadFinancialDoc(fdoc);
		PropertyDoc doc =docf.createPropDoc(propDocData);
		uploadPropertyDoc(doc);
		saveCustomer(new Customer("Muskan"));
		system.showDetails();	
		 
		
	}

	public void saveCustomer(Customer curCust)
	{
		// Entry Point Here
		system.getLoanUnderProcess().curCust = curCust;
		system.getLoanUnderProcess().initiateLoan(  );
		
	}
	
	public void uploadFinancialDoc(FinancialDoc doc)
	{
		ArrayList<FinancialDoc>  lst =
				(ArrayList<FinancialDoc>) system.getLoanUnderProcess().getFinancialDocs();
		if(lst == null)
		{
			lst = new ArrayList<FinancialDoc>();
		}

		lst.add(doc);
		
		system.getLoanUnderProcess().setFinancialDocs(lst);
		 
	}

	public void uploadPropertyDoc(PropertyDoc doc)
	{
		ArrayList<PropertyDoc>  docList =
				(ArrayList<PropertyDoc>) system.getLoanUnderProcess().getPropertyDocs();
		if(docList == null)
		{
			docList = new ArrayList<PropertyDoc>();
		}

		docList.add(doc);
		
		system.getLoanUnderProcess().setPropertyDocs(docList);
	}

	public void acceptTermSheet()
	{
		LoanTermSheet sheet= system.getLoanUnderProcess().generateTermSheet();
		sheet.markAccepted();
		System.out.println(""+system.getLoanUnderProcess().curCust.getName()+" accepted loan termsheet ");
		
	}


}
