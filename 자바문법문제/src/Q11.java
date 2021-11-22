public class Q11 {
	static String result = "1";

	public static void main(String[] args) {
		method(0);
		System.out.println(result);
	}

	public static void method(int x) {
		try {
			x /= x;
		} catch (ArithmeticException e) {
			result += "2";
		} catch (Exception e) {
			result += "3";
		} finally {
			result += "4";
		}
		result += "5";
	}
}