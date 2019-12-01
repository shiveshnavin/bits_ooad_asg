package bits.oad.ooad_asg.submission;

import bits.oad.ooad_asg.finance.FinancialDoc;

public class DocumentFactory {

	public FinancialDoc createFinDoc(String data)
	{
		return new FinancialDoc(data);
	}
	public PropertyDoc createPropDoc(String data)
	{
		return new PropertyDoc(data);
	}
	
}
