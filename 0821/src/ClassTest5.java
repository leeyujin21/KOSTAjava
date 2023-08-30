class Account {
	String id;
	String name;
	int balance;
	Account(){}	//기본생성자
	Account(String aid, String aname, int money) {	//이름이 같을 경우에는 가장 가깝게 선언된 변수를 인식
		id = aid;
		name = aname;
		balance = money;
	}

	String info() {
//		return "계좌번호: " + id + ", 이름: " + name + ", 잔액: " + balance;
		return String.format("계좌번호: %s, 이름: %s, 잔액: %d", id, name, balance);
	}

	void deposit(int money) {
		balance += money;
	}

	void withdraw(int money) {
		if (balance >= money)
			balance -= money;
	}

} //Account end

class Bank {
	Account[] accs = new Account[100];
	int accCnt;

	void makeAccount(String id, String name, int money) {
		Account acc = new Account(id, name, money);
//		acc.id = id;
//		acc.name = name;
//		acc.balance = money;
		accs[accCnt++] = acc;
	}

	void allAccountinfo() {
		// 계좌번호 : 10001, 이름: 고길동, 잔액: 100000
		// 계좌번호 : 10002, 이름: 김길동, 잔액: 200000
		for (int i = 0; i < accCnt; i++) {
			System.out.println(accs[i].info());
		}
	}

	Account searchAccById(String id) {
		Account acc = null;
		for (int i = 0; i < accCnt; i++) {
			if (accs[i].id.equals(id)) {
				return accs[i];
			}
		}
		return null;
	}

	void accountInfo(String id) {
		Account acc = searchAccById(id);
		for (int i = 0; i < accCnt; i++) {
			if (accs[i].id.equals(id)) {
				acc = accs[i];
				System.out.println(accs[i].info());
				break;
			}
		}
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return; // for문의 break와 비슷
		}
	}

	void deposit(String id, int money) {
		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return; // for문의 break와 비슷
		}
		acc.deposit(money);
	}

	void withdraw(String id, int money) {
		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return; // for문의 break와 비슷
		}
		acc.withdraw(money);
	}
}	//Bank end

public class ClassTest5 {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.makeAccount("10001", "고길동", 100000);
		bank.makeAccount("10002", "김길동", 200000);

		bank.allAccountinfo();
		// 계좌번호 : 10001, 이름: 고길동, 잔액: 100000
		// 계좌번호 : 10001, 이름: 김길동, 잔액: 210000

		bank.accountInfo("10001");
		// 계좌번호 : 10001, 이름: 고길동, 잔액: 100000

		bank.deposit("10001", 10000);
		bank.accountInfo("10001");
		// 계좌번호 : 10001, 이름: 고길동, 잔액: 110000

		bank.withdraw("10001", 5000);
		bank.accountInfo("10001");
		// 계좌번호 : 10001, 이름: 고길동, 잔액: 105000

//		Account acc1 = new Account();
//		acc1.id = "10001";
//		acc1.name = "고길동";
//		acc1.balance = 100000;
//		System.out.println(acc1.info());
//		acc1.deposit(10000);
//		System.out.println(acc1.info());
//		acc1.withdraw(20000);
//		System.out.println(acc1.info());
	}
}