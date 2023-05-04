import java.util.Arrays;

public class Cart {
 String clientId;
 Article[] articles = new Article[] {};
 double total = 0;
	public Cart(String clientId) {
		this.clientId = clientId;
	}
	public void addToCart(Article a) {
		Article[] articles;
		articles = new Article[this.articles.length + 1];
		System.arraycopy(this.articles, 0, articles, 0, this.articles.length);
		articles[this.articles.length] = a;
		System.out.println(Arrays.toString(articles));
		this.articles = articles;
	}
}
