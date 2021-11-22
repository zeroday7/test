import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 왜? 장점이 먼지?
 * 1) private 접근제한자
 * 2) final
 * 3) FileInputStream() -> FileNotFoundException
 * 4) fis.read() -> IOException
 * 5) finally 구문 왜?
 * 6) fis.close() -> IOException
 */

public class A01 {
	// https://cafe.naver.com/jjdev
	// 필드
	private static final String FILENAME = "c:\\test\\q01.txt"; // 상수 -> 대문자표현식(스네이크표현식)
	private static FileInputStream fis = null; // 1byte단위로(이진수) 프로그램안으로 불러오는 스트림

	public static void main(String[] args) {
		try {
			fis = new FileInputStream(FILENAME);// https://cafe.naver.com/jjdev
			int num = -1;
			while((num = fis.read()) != -1) {
				System.out.print((char)num);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 발생");
			
		} catch (IOException e) {
			System.out.println("IOException 발생");
			
		} finally {
			try {
				fis.close(); // input/ouput strema객체는 가비지컬렉터 대상이 아닙니다. -> 직접 객체 삭제가 필요
			} catch (IOException e) {
				System.out.println("file.close():예외발생");
			}
		}
	}
}
