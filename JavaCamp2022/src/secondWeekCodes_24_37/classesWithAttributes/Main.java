package classesWithAttributes;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Black");

        Product product2 = new Product();
        product2.setId(1);
        product2.setName("Laptop");
        product2.setDescription("Asus Laptop");
        product2.setPrice(5000);
        product2.setStockAmount(3);

        productManager productManager = new productManager();
        System.out.println(product.getDescription());
        System.out.println(product.getCode());
        productManager.Add(product);


    }
}
