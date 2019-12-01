package bits.oad.ooad_asg.finance;

import bits.oad.ooad_asg.Util;
import bits.oad.ooad_asg.submission.Doccument;

public class FinancialDoc extends Doccument {

	public boolean isValid = false;
	
	
	public FinancialDoc(String data) {
		super();
		this.data = data;
		if(data.contains("invalid"))
		{
			isValid = false;
		}
		else
		{
			isValid = true;
		}
	}
	

}
