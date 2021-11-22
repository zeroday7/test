public class Q06 {
	// 오류코드 원인? -> 해결방법이 있다면? or 없다면?
	public static void main(String[] args) {
		Parent parent = new Parent();
		((Child)parent).subMethod(); // 예외발생 : 원본이 parent
			
		Child child = new Child();
			
		// 원본은 child객체
		parent = child; // 다형성
		child = (Child) parent;
		
		// parent.subMethod(); // parent는 child객체를 참조중이다. 형변화 후 사용은 가능하다 

		//5번째줄 코드는 예외가 발생하지만 16번째 줄은 정상실행
		((Child)parent).subMethod(); // 정상실행 : 원본이 child
		
		child.superMethod();
		//System.out.println(parent.a); // private
		System.out.println(parent.b);
		System.out.println(parent.c);
		//System.out.println(parent.x);
		//System.out.println(parent.y);
		//System.out.println(parent.z);
		//System.out.println(child.a);
		System.out.println(child.b);
		System.out.println(child.c);
		//System.out.println(child.x);
		System.out.println(child.y);
		System.out.println(child.z);

	}
}

class Parent {
	private int a = 1; // 자신만
	protected int b = 2; // 같은팩키지+자식클래스
	public int c = 3;

	public void superMethod() {
		System.out.println("superMethod");
	}
}

class Child extends Parent {
	private int x = 4;
	protected int y = 5; // 같은패키지
	public int z = 6;

	public void subMethod() {
		System.out.println("subMethod");
	}
}