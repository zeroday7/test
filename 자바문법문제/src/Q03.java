public class Q03 {
	public static void main(String[] args) {
		Q03 q = new Q03();
		int a = 20;
		int[] b = {100, 200, 300};
		q.change(a, b);
		q.display(a, b);
	}

	void change(int a, int[] b) {
		a = a + 10;
		b[1] = b[1] + 10;
	}

	void display(int a, int b[]) {
		System.out.print(a + "/" + b[1]);
	}
}