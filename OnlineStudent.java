package p2;

public class OnlineStudent extends Student {
	private boolean mTechFee;
	
	//constructor	
	public OnlineStudent(String pId, String pFirstName, String pLastName) {
		super(pId, pFirstName, pLastName);
		
	}
	
	@Override
	public void calcTuition() {
		double t = getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;
		
		if (getTechFee() == true) {
			t = t + TuitionConstants.ONLINE_TECH_FEE;
		}
		setTuition(t);		
		
	}
	
	/**
    * Acessor method for mTechFee.
    */
	public boolean getTechFee() {
		return mTechFee;
	}
	
	/**
    * Mutator method for mTechFee.
    */
	public void setTechFee(boolean pTechFee) {
		mTechFee = pTechFee;
	}
}
