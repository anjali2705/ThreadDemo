package Interface;

public class Tata extends Car{

	@Override
	public void color() {
		System.out.println("Red");
	}
	
	public static void main(String[] args) {
		Tata t = new Tata();
		t.color();
	}
	
	

}
