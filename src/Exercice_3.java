
public class Exercice_3 {

	public static void main(String[] args) {
		
		Client newClient = new Client("cli-1234","Mario Rossi","mail@mail.it");
		Article item_1 = new Article("item-1-abc","Bla bla bla", 100, 4);
		Article item_2 = new Article("item-2-def","Bla bla bla", 50, 3);
		Cart newCart = new Cart(newClient.id);
		newCart.addToCart(item_1);
		newCart.addToCart(item_2);
	}

}
