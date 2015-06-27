package PokeMVC;

public class PokeControl {
	public static void main(String[] args) {
		PokeView display = new PokeView();
		display.output("This is out putted through view");
		
		PokeModel model = new PokeModel();
		String connected = model.PokeModel("This is out putted through view");
		display.output(connected);
	}
}
