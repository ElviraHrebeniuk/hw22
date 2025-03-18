import java.util.Comparator;

public class CompareByRating implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getRating(), o2.getRating());
    }
}
