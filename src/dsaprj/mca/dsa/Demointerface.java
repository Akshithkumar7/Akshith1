package dsaprj.mca.dsa;

public class Demointerface implements Game {
	public static void main(String[]args) {
		Demointerface D=new Demointerface();
		D.move();
	}
	public void move() {
		System.out.println("moving left");
	}

}
