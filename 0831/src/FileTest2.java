import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		File f = new File("C:\\lyj");
		if (!f.exists() || !f.isDirectory()) {
			return;
		}
//		String[] files = f.list(); //문자열
//		for(String file : files) {
//			System.out.println(file);
//		}

		File[] files = f.listFiles();
		int totLength = 0;
		for (File file : files) {
			totLength += file.length();
			System.out.println(file.isDirectory() ? "[" + file.getName() + "]" : file.getName());
		}
		System.out.println(totLength);
//			if(file.isDirectory()) {
//				System.out.println("["+file.getName()+"]");
//			}else {
//				System.out.println(file.getName());
//			}

	}

}
