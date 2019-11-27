package bits.oad.ooad_asg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.apache.catalina.startup.HomesUserDatabase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import bits.oad.ooad_asg.administration.Clerk;
import bits.oad.ooad_asg.administration.Officer;
import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.finance.Loan;
import bits.oad.ooad_asg.scrutiny.PropertyApprovalRequest;
import bits.oad.ooad_asg.submission.Customer;
import bits.oad.ooad_asg.submission.CustomerController;
import bits.oad.ooad_asg.submission.PropertyDoc;

@SpringBootTest
class OoadAsgApplicationTests {
	
	
	@BeforeEach
    public void beforeEachTestMethod() {
        System.out.println("<-------Enter-------------->");
    }

	@AfterEach
    public void afterEachTestMethod() {
        System.out.println("<--------Exit------------->");
    }
 
	
	// Will Not Approve
	@Test
	void approvalTestNegetive()
	{

		HousingLoanSystemExpert h=new HousingLoanSystemExpert();
		h.curLoan=new Loan(1000);
		h.curLoan.setPropertyApprovalRequest(new PropertyApprovalRequest());
		h.createExternalCreditApprovalRequest();		
		assertEquals(false, h.doApproval());
		h.showDetails();
		

	}
	

	// Will Approve
	@Test
	void approvalTestPositive()
	{

		HousingLoanSystemExpert h=new HousingLoanSystemExpert();
		//h.curLoan=new Loan(1000);
		h.curLoan.setPropertyApprovalRequest(new PropertyApprovalRequest());
		h.createExternalCreditApprovalRequest();		
		h.curLoan.getPropertyApprovalRequest().setStatus(true);
		h.curLoan.setFinDocValStatus(true);
		
		assertEquals(true, h.doApproval());
	}
	
	@Test
	void initiateLoan()
	{
		CustomerController c=new CustomerController();
		c.initiateLoan(5000);
		FinancialDoc fdoc =new FinancialDoc("doc data ");
		c.uploadFinancialDoc(fdoc);
		PropertyDoc doc =new PropertyDoc("doc data ");
		c.uploadPropertyDoc(doc);
		c.saveCustomer(new Customer(Util.getInstance().newId(),"Muskan"));
		System.out.println(HousingLoanSystemExpert.curLoan.getLoanId());		
		assertNotEquals(0, HousingLoanSystemExpert.curLoan.getLoanId());
		
		
	}
	@Test
	void validateLoan()
	{
		Clerk clerk=new Clerk();
		System.out.println("clerk has received request from customer");
		Officer officer=new Officer();
		//officer.checkCredValidity();
//		c.initiateLoan(5000);
//		FinancialDoc fdoc =new FinancialDoc("doc data ");
//		c.uploadFinancialDoc(fdoc);
//		PropertyDoc doc =new PropertyDoc("doc data ");
//		c.uploadPropertyDoc(doc);
//		c.saveCustomer(new Customer(Util.getInstance().newId(),"Muskan"));
//		System.out.println(HousingLoanSystemExpert.curLoan.getLoanId());
//		assertNotEquals(0, HousingLoanSystemExpert.curLoan.getLoanId());
		
		
	}

}
