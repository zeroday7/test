import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Q07 {
	public static void main(String[] args) {
		Set<Singer> set = new HashSet<>();
		Singer singer;

		singer = new Singer();

		singer.setName("admin");
		singer.setAge(30);
		set.add(singer);
		// Singer singer2 = new Singer();
		singer.setName("guest");
		singer.setAge(32);
		set.add(singer);
		// 이트레이트 패턴 : 순서가 없는 자료구조 일시적을 순서가 있는것처럼
		Iterator<Singer> it = set.iterator();
		while (it.hasNext()) { 
			System.out.println(it.next().getName());
		}
	}

}

class Singer {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
