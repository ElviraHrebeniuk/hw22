import java.util.Comparator;

public class ComparatorByTitle implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
    }
}
