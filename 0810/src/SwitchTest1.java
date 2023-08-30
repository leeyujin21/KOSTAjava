import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수:");
		int kor = sc.nextInt();
		System.out.print("영어점수:");
		int eng = sc.nextInt();
		System.out.print("수학점수:");
		int math = sc.nextInt();
		
		int tot = kor+eng+math;
		double avg = tot/(double)3;
		
		String grade = null;
		
		switch((int)avg/10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default : grade = "F";
		}
		System.out.println(grade);
		
		char ch = ' ';
	}
}