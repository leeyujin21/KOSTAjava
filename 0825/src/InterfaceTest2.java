class MyButton {
	//기능의 일부만 바꾸는 것 -> 상속 받아서 오버로딩
	String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	void click() {
		System.out.println("기본 버튼 클릭");
	}
}
class LoginButton extends MyButton{
	@Override
	void click() {
		super.click();
		System.out.println("로그인 처리");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		MyButton loginBtn = new MyButton();
		loginBtn.setTitle("로그인");
		loginBtn.click();
	}
}