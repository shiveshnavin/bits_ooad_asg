package bits.oad.ooad_asg.administration;

import java.util.List;

import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.submission.PropertyDoc;

public class Clerk {
	
	int id;
	
	public boolean verifyDoc(List<FinancialDoc> doc)
	{
		System.out.println("Clerk : Verifying financial Docs");
		return true;
		
	}
	
	public void filePropertyDocs(List<PropertyDoc> doc)
	{
		System.out.println("Clerk : Filing financial Docs");

	}

}
