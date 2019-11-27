package bits.oad.ooad_asg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.apache.catalina.startup.HomesUserDatabase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import bits.oad.ooad_asg.administration.Clerk;
import bits.oad.ooad_asg.administration.Officer;
import bits.oad.ooad_asg.finance.FinancialDoc;
import bits.oad.ooad_asg.finance.Loan;
import bits.oad.ooad_asg.scrutiny.PropertyApprovalRequest;
import bits.oad.ooad_asg.submission.Customer;
import bits.oad.ooad_asg.submission.CustomerController;
import bits.oad.ooad_asg.submission.PropertyDoc;

class OoadAsgApplicationTests {

	HousingLoanSystem sys = HousingLoanSystem.getInstance();
	CustomerController cst = new CustomerController();

	@BeforeTestClass
	public void init() {

		sys = HousingLoanSystem.getInstance();
		cst = new CustomerController();
	}

	@BeforeEach
	public void afterEachTestMethod() {

		
		System.out.println("\n");
		
	}

	@Test
	public void bestCase() {
		System.out.println("================Test Case : best Case================");
		cst.initiateLoan(5000, "136 , Whitefield , Bangalore ", "Ext Credit Score 2500");

		System.out.println(
				"::::::::::: Use Case : Verification (Loan:" + sys.getLoanUnderProcess().getLoanId() + ") :::::::::::");
		sys.doVerification();

		System.out.println(
				"::::::::::: Use Case : Approval (Loan:" + sys.getLoanUnderProcess().getLoanId() + "):::::::::::");
		if (sys.doApproval())
			cst.acceptTermSheet();

	}

	@Test
	public void propertyIsRestricted() {
		System.out.println("================Test Case : property Is Restricted================");
		cst.initiateLoan(15000, "10 Janpath , New Delhi (restricted)", "Ext Credit Score 5500");

		System.out.println(
				"::::::::::: Use Case : Verification (Loan:" + sys.getLoanUnderProcess().getLoanId() + ") :::::::::::");
		sys.doVerification();

		System.out.println(
				"::::::::::: Use Case : Approval (Loan:" + sys.getLoanUnderProcess().getLoanId() + "):::::::::::");
		if (sys.doApproval())
			cst.acceptTermSheet();

	}

	@Test
	public void amountExceedsLimit() {
		System.out.println("================Test Case : amount Exceeds Limit================");
		cst.initiateLoan(9900000, "145 , Whitefield , Bangalore", "Ext Credit Score 5500");

		System.out.println(
				"::::::::::: Use Case : Verification (Loan:" + sys.getLoanUnderProcess().getLoanId() + ") :::::::::::");
		sys.doVerification();

		System.out.println(
				"::::::::::: Use Case : Approval (Loan:" + sys.getLoanUnderProcess().getLoanId() + "):::::::::::");
		if (sys.doApproval())
			cst.acceptTermSheet();

	}

	@Test
	public void invalidCredit() {
		System.out.println("================Test Case : invalid Credit================");
		cst.initiateLoan(9900000, "145 , Whitefield , Bangalore", "Ext Credit Score 5500 (invalid)");

		System.out.println(
				"::::::::::: Use Case : Verification (Loan:" + sys.getLoanUnderProcess().getLoanId() + ") :::::::::::");
		sys.doVerification();

		System.out.println(
				"::::::::::: Use Case : Approval (Loan:" + sys.getLoanUnderProcess().getLoanId() + "):::::::::::");
		if (sys.doApproval())
			cst.acceptTermSheet();

	}

}
