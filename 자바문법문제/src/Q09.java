public class Q09 {
	public static void main(String[] args) {
	//	Sub sub = new Sub("admin", 30);
	}
}


class Super {
	String name;
	int age;
	// 첫번째방법은 부모클래스에 디폴트 생성자 추가
	// Super() {}
	
	Super(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
/*
class Sub extends Super {
	Sub(String name, int age) { 
		// 두번째 방법은 자식생성자 제일 윗줄에 자동으로 생성되는 부모디폴트 생성자코드 대신 구현되어 있는 부모생성자를 호출한다.
		// super(name, age);
		if (name.equals("")) {
			this.name = "guest";
		}
		if (age < 1 || age > 200) {
			this.age = 1;
		}
		System.out.println("이름:" + this.name + "/나이:" + this.age);
	}
}
*/

// 설명 : 자동으로 생성되는 코드
class A {
	String s;
	// 1
	A() {
		//2
		super(); // Object();
		// 3
		this.s = null; // null, 0, false
	}
}
class B extends A {
	// 1
	B() {
		// 2
		super(); // A()
	}
}