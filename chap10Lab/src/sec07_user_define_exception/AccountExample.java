package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance() + "원");
		
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
