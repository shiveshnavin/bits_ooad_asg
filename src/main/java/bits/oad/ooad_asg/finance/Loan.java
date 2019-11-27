package bits.oad.ooad_asg.finance;

import java.util.List;

import bits.oad.ooad_asg.Util;
import bits.oad.ooad_asg.administration.SalesPerson;
import bits.oad.ooad_asg.scrutiny.PropertyApprovalRequest;
import bits.oad.ooad_asg.submission.Customer;
import bits.oad.ooad_asg.submission.PropertyDoc;

public class Loan {
	
	private int loanId=0;
	private long dateTime;
	private float principalAmount;
	private float interestRate;
	private boolean credValStatus;
	private boolean finDocValStatus;
	private List<FinancialDoc> financialDocs;
	private List<PropertyDoc> propertyDocs;
	public Customer curCust;
	private boolean propertyApprovalRequestStatus;
	private LoanTermSheet loanTermSheet;
	private SalesPerson salesMan;
	
	
	public Loan(float amount) {

		dateTime = System.currentTimeMillis();
		loanId=0;
		this.dateTime = dateTime;
		this.principalAmount = amount;
		this.credValStatus = credValStatus;
		setSalesMan(new SalesPerson(Util.getInstance().newId(),"Juann Middleman"));
		
	}
	
	public LoanTermSheet generateTermSheet()
	{
		loanTermSheet = new LoanTermSheet();
		return loanTermSheet;
	}

	public void initiateLoan() {
		this.loanId = Util.getInstance().newId();
		
	}
	
	
	
	

	public int getLoanId() {
		return loanId;
	}



	public float getAmount() {
		return principalAmount;
	}


	public boolean isCredValStatus() {
		return credValStatus;
	}

	public void setCredValStatus(boolean credValStatus) {
		this.credValStatus = credValStatus;
	}

	public boolean getPropertyApprovalRequestStatus() {
		return propertyApprovalRequestStatus;
	}

	public void setPropertyApprovalRequestStatus(boolean propertyApprovalRequestStatus) {
		this.propertyApprovalRequestStatus = propertyApprovalRequestStatus;
	}

	public List<FinancialDoc> getFinancialDocs() {
		return financialDocs;
	}

	public void setFinancialDocs(List<FinancialDoc> financialDocs) {
		this.financialDocs = financialDocs;
	}

	public boolean isFinDocValStatus() {
		return finDocValStatus;
	}

	public void setFinDocValStatus(boolean finDocValStatus) {
		this.finDocValStatus = finDocValStatus;
	}

	public List<PropertyDoc> getPropertyDocs() {
		return propertyDocs;
	}

	public void setPropertyDocs(List<PropertyDoc> propertyDocs) {
		this.propertyDocs = propertyDocs;
	}

	public boolean getFinDocValStatus() {
	 
		return finDocValStatus;
	}


	public void setSalesMan(SalesPerson salesMan) {
		this.salesMan = salesMan;
	}
	
	
	
	
	

}
