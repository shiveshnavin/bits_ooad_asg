package bits.oad.ooad_asg.submission;

import bits.oad.ooad_asg.finance.FinancialDoc;

public class DocumentFactory {

	public Doccument createFinDoc(String data)
	{
		return new FinancialDoc(data);
	}
	public Doccument createPropDoc(String data)
	{
		return new PropertyDoc(data);
	}
	
}
