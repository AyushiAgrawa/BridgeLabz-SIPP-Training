package Generics.Day1_ProgrammingElements;
import java.util.*;

interface Category {
    String getName();
}

enum BookCategory implements Category {
    FICTION, SCIENCE, HISTORY;
    public String getName() { return name(); }
}

enum ClothingCategory implements Category {
    MENS, WOMENS, KIDS;
    public String getName() { return name(); }
}

enum GadgetCategory implements Category {
    MOBILE, LAPTOP, ACCESSORY;
    public String getName() { return name(); }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public T getCategory() { return category; }

    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return name + " | " + category.getName() + " | Rs." + price;
    }
}

class Catalog {
    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public List<Product<? extends Category>> getProducts() {
        return products;
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(discountedPrice);
    }
}

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 40, BookCategory.SCIENCE);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20, ClothingCategory.MENS);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 600, GadgetCategory.MOBILE);

        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Before Discount:");
        catalog.getProducts().forEach(System.out::println);

        Catalog.applyDiscount(book, 10);
        Catalog.applyDiscount(phone, 20);

        System.out.println("\nAfter Discount:");
        catalog.getProducts().forEach(System.out::println);
    }
}
