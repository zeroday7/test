public class Q10 {

	public static void main(String[] args) {
		Person[] persons = new Person[2];
		persons[0] = new Dancer();
		persons[1] = new Actor();
		for (int i = 0; i < persons.length; i++) { // 다형성
			persons[i].play(); // 부모타입으로 실제 자식 객체의 오버라이딩된 메서드 호출 <- 다형성
			// persons[i].test(); // 오버라이딩 메서드가 아니다 -> Person타입으로는 참조할 수 없다.
			persons[i].display();
		}
	}
}

abstract class Person { // new Person() X -> 추상클래스는 객체를 만들 수 없다
	String str;

	abstract void play();

	void display() {
		System.out.println(str);
	}
}

class Dancer extends Person { // Person p = new Dancer();
	@Override
	protected void play() {
		str = "춤춘다";
	}
	public void test() {}
}

class Actor extends Person {
	@Override
	protected void play() {
		str = "연기한다";
	}
}
