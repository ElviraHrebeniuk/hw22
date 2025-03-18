public class Product {
    private String title;
    private double price;
    private int  rating;
    private int remaining;

    public Product(String title, double price, int rating, int remaining) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.remaining = remaining;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public int getRemaining() {
        return remaining;
    }

    @Override
    public String toString() {
        return "Product{" + title + ", price=" + price + ", rating=" + rating + ", remaining=" + remaining + '}';
    }
}
