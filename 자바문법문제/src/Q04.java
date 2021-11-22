// 캡슐화 - Player클래스의 장점을 캡슐화 관점에서 설명하시오. 
public class Q04 {
	public static void main(String[] args) {
		Player luffy = new Player();
		Player zoro = new Player();
		Player nami = new Player();
		
		System.out.println(luffy.getId());
		System.out.println(zoro.getId());
		System.out.println(nami.getId());
	}
}

class Player {
	private static int nextId = 1; // 1) Why private? static?
	private int id; // 2) Why private?
	public Player() { // 3) Why public?
		this.id = Player.nextId++;
	}
	protected int getId() { // 4) Why protected?
		return id;
	}
	private void setId(int id) { // 5) Why private?
		this.id = id;
	}
}


