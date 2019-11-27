package bits.oad.ooad_asg.submission;

import java.util.List;

import bits.oad.ooad_asg.Util;
import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.finance.LoanTermSheet;

public class Customer {
	
	int id;
	private String name;
	List<Appartment> appartments;
	public Customer( String name) {
		super();
		this.id = Util.getInstance().newId();
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
