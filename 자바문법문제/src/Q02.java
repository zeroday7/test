public class Q02 {
	public static int[] arNum = { 7, 9, 1, 4, 5 };

	public static void main(String[] args) {
		int out = 0;
		int in = 0;

		Q02 t = new Q02();
		
		// 버블정렬, 선택정렬, 삽입정렬, 쉘정렬, 합병정렬, 힙정렬, 퀵정렬
		
		for (out = arNum.length - 1; out > 0; out--) {
			// 버블정렬? -> 실행결과 -> 14579
			
			// out -> 4 
			//		in -> 0 -> X {7, 9, 1, 4, 5}
			// 		in -> 1 -> {7, 1, 9, 4, 5}
			// 		in -> 2 -> {7, 1, 4, 9, 5}
			//		in -> 3 -> {7, 1, 4, 5, 9}
			
			// out -> 3
			//		in -> 0 -> {1, 7, 4, 5, 9}
			//		in -> 1 -> {1, 4, 7, 5, 9}
			//		in -> 2 -> {1, 4, 5, 7, 9}
			
			// out -> 2
			//		in -> 0 -> X {1, 4, 5, 7, 9}
			//		in -> 1 -> X {1, 4, 5, 7, 9}
			
			// out -> 1
			// 		in -> 0 -> X {1, 4, 5, 7, 9}
			for (in = 0; in < out; in++) { // 무한루프 for문을 14579라는 결과가 출력되도록 for문을 수정하시오.
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