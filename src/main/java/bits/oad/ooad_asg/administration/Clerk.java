package bits.oad.ooad_asg.administration;

import java.util.List;

import bits.oad.ooad_asg.HousingLoanSystem;
import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.finance.Loan;
import bits.oad.ooad_asg.submission.PropertyDoc;

public class Clerk {
	
	int id;

	
	public Clerk( ) { 
	}

	public boolean verifyFinDoc(List<FinancialDoc> docs)
	{ 
		System.out.println("Clerk : Verifying financial Docs");

		boolean finDocStatus = true;
		
		for(FinancialDoc finDoc:docs){
			
			finDocStatus = finDoc.isValid && finDocStatus;
			
		}


		return finDocStatus;
		
	}
	
	public void filePropertyDocs()
	{
		System.out.println("Clerk : Filing financial Docs");

	}

}
