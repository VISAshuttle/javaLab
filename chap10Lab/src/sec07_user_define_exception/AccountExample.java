package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("μκΈμ‘: " + account.getBalance() + "μ");
		
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String ErrMsg = e.getMessage();
			System.out.println(ErrMsg);
//			System.out.println();
//			e.printStackTrace();
		}
	}

}
