package bits.oad.ooad_asg;

import bits.oad.ooad_asg.submission.CustomerController;

public class HousingLoanDriver {

	public static void main(String[] args) {
		HousingLoanSystem sys =HousingLoanSystem.getInstance();
		
		System.out.println("::::::::::: Use Case : Initiate :::::::::::");
		
		CustomerController cst=new CustomerController(); 
		cst.initiateLoan(5000, "11/25B , Whitefield , BLR ", "Ext Credit Score 2500");
		
		System.out.println("::::::::::: Use Case : Verification :::::::::::");
		sys.doVerification();

		System.out.println("::::::::::: Use Case : Approval :::::::::::");
		if(sys.doApproval())
		 cst.acceptTermSheet();
		
		
		

		cst=new CustomerController(); 
		cst.initiateLoan(5000000, "11/25B , Whitefield , BLR ", "Ext Credit Score 2500 ");
		
		System.out.println("::::::::::: Use Case : Verification :::::::::::");
		sys.doVerification();

		System.out.println("::::::::::: Use Case : Approval :::::::::::");
		if(sys.doApproval())
		 cst.acceptTermSheet();
	}
}
