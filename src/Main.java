import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Laptop Dell", 1900, 5,13));
        productList.add(new Product("Laptop Acer", 600, 3,2));
        productList.add(new Product("Laptop Lenovo", 1000, 4,20));
        productList.add(new Product("Laptop Asus", 1500, 4,15));
        productList.add(new Product("Laptop Apple", 2000, 5,8));

        print(productList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ сортировки: ");
        System.out.println("1 - по алфавиту ");
        System.out.println("2 - по возрастанию цены ");
        System.out.println("3 - по убыванию цены ");
        System.out.println("4 - по рейтингу ");
        System.out.println("5 - по остатку на складе ");

        int variant = scanner.nextInt();

        System.out.print("Вы выбрали вариант сортировки : ");
        switch (variant){
            case 1 -> {
                System.out.println(" по алфавиту:");
                Collections.sort(productList,new ComparatorByTitle());
                print(productList);
                System.out.println("--------------");
            }
            case 2 -> {
                System.out.println(" по возрастанию цены:");
                Collections.sort(productList,new ComparatorByPrice());
                print(productList);
                System.out.println("--------------");
            }
            case 3 -> {
                System.out.println(" по убыванию цены:");
                Collections.sort(productList,new ComparatorByPrice().reversed());
                print(productList);
                System.out.println("--------------");
            }
            case 4 -> {
                System.out.println(" по рейтингу:");
                Collections.sort(productList,new CompareByRating());
                print(productList);
                System.out.println("--------------");
            }
            case 5 -> {
                System.out.println(" по остаткам на складе:");
                Collections.sort(productList,new CompareByRemaining());
                print(productList);
                System.out.println("--------------");
            }
            default -> {
                return;
            }
        }
    }

    public static void print(List<Product> productList){
        for(Product pro:productList)
            System.out.println(pro);
        }
    }
