package bits.oad.ooad_asg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import bits.oad.ooad_asg.finance.Loan;
import bits.oad.ooad_asg.scrutiny.PropertyApprovalRequest;

@SpringBootTest
class OoadAsgApplicationTests {
	
	
	@BeforeEach
    public void beforeEachTestMethod() {
        System.out.println("<--------------------->");
    }

	@AfterEach
    public void afterEachTestMethod() {
        System.out.println("<--------------------->");
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
		

	}
	

	// Will Approve
	@Test
	void approvalTestPositive()
	{

		HousingLoanSystemExpert h=new HousingLoanSystemExpert();
		h.curLoan=new Loan(1000);
		h.curLoan.setPropertyApprovalRequest(new PropertyApprovalRequest());
		h.createExternalCreditApprovalRequest();		
		h.curLoan.getPropertyApprovalRequest().setStatus(true);
		h.curLoan.setFinDocValStatus(true);
		
		assertEquals(true, h.doApproval());
	}

}
