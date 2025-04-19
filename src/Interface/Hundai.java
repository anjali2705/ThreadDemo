package Interface;

public class Hundai extends Car{
	
	

	@Override
	public void color() {
		System.out.println("White");
	}

	public static void main(String[] args) {
		Hundai h = new Hundai();
		h.color();
	}

}
