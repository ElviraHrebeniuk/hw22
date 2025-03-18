import java.util.Comparator;

public class CompareByRemaining implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getRemaining(), o2.getRemaining());
    }
}
