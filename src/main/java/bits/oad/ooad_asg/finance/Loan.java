package bits.oad.ooad_asg.finance;

import java.util.List;

import bits.oad.ooad_asg.Util;
import bits.oad.ooad_asg.scrutiny.ApprovalRequest;
import bits.oad.ooad_asg.submission.Customer;
import bits.oad.ooad_asg.submission.PropertyDoc;

public class Loan {
	
	private int loanId;
	private long dateTime;
	private float principalAmount;
	private float interestRate;
	private boolean credValStatus;
	private List<FinancialDoc> financialDocs;
	private List<PropertyDoc> propertyDocs;
	private Customer curCust;
	private ApprovalRequest approvalRequest;
	private LoanTermSheet loanTermSheet;
	
	
	public Loan(long dateTime, float amount, boolean credValStatus) {


		loanId = Util.getInstance().newId();
		this.dateTime = dateTime;
		this.principalAmount = amount;
		this.credValStatus = credValStatus;
		
	}
	
	public LoanTermSheet generateTermSheet()
	{
		loanTermSheet = new LoanTermSheet();
		return loanTermSheet;
	}
	
	
	
	
	

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public long getDateTime() {
		return dateTime;
	}

	public void setDateTime(long dateTime) {
		this.dateTime = dateTime;
	}

	public float getAmount() {
		return principalAmount;
	}

	public void setAmount(float amount) {
		this.principalAmount = amount;
	}

	public boolean isCredValStatus() {
		return credValStatus;
	}

	public void setCredValStatus(boolean credValStatus) {
		this.credValStatus = credValStatus;
	}
	
	
	
	
	

}
