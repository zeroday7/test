public class A02 {
	public static int[] arNum = { 7, 9, 1, 4, 5 };

	public static void main(String[] args) {
		int out = 0;
		int in = 0;

		A02 t = new A02();
		
		for (out = arNum.length - 1; out > 0; out--) {
			// 실행결과 -> 14579
			for (;;) { // 무한루프 for문을 14579라는 결과가 출력되도록 for문을 수정하시오.
				if (arNum[in] > arNum[in + 1]) {
					t.swap(in, in + 1);
				}
			}
		}
		t.display();
	}

	public void swap(int one, int two) {
		int temp = arNum[one];
		arNum[one] = arNum[two];
		arNum[two] = temp;
	}

	public void display() {
		for (int index = 0; index < arNum.length; index++) {
			System.out.print(arNum[index]);
		}
	}
}