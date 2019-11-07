package bits.oad.ooad_asg.scrutiny;

public class LoanNotApprovedException extends Exception {

	private String msg;
	public LoanNotApprovedException(String err) {


		msg = err;

	}
	

	@Override
	public String getMessage()
	{
		return msg;
	}
	

}
