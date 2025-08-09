import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class testik {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200),
                new Product("Table", "Furniture", 300),
                new Product("Headphones", "Electronics", 150),
                new Product("Sofa", "Furniture", 800),
                new Product("Shirt", "Clothing", 50)
        );


        Map<String, List<Product>> collect = products.stream().collect(Collectors.groupingBy(Product::getType));

        System.out.println(collect);
    }
}
