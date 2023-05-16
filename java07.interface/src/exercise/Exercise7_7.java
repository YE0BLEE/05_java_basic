package exercise;

class Parentt {
	int x = 100;
	
	Parentt() {
		this(200);
	}
	
	Parentt (int x) {
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Childd extends Parentt {
	int x = 3000;
	
	Childd() {
		this(1000);
	}
	
	Childd(int x) {
		this.x = x;
	}
}

public class Exercise7_7 {

	public static void main(String[] args) {

		Childd c = new Childd();
		
		System.out.println("x = " + c.getX());
		// Child() -> Child(int x) -> Parent() -> Parent(int x) -> Object  // x = 200
	}

}








