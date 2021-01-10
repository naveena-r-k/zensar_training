package Saturday1.task6;
/**/
public class Bank {

	int accountNo;
	String holderName;
	
	void add() {}

	public Bank(int accountNo, String holderName) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", holderName=" + holderName + "]";
	}
	
	
}
