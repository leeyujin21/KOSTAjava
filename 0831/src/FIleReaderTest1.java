import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderTest1 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("news.txt");
			br = new BufferedReader(fr);
			int data; // FileInputStream은 타입을 int로 해줘도 1바이트만 읽어옴 -> FileReader 사용
			while ((data = br.read()) != -1) { // 괄호 주의 -> 괄호 없으면 오류 뜸
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}