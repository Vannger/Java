package lab7;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создаем Enum для названий продуктов
        enum ProductName {
            MAYONNAISE("Mayonnaise Makheev"),
            EGGS("Eggs"),
            SNICKERS("Snickers"),
            BREAD("Bread"),
            CHEESE("Cheese");

            private final String name;

            ProductName(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
        ArrayList<Product> cart = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            String name = ProductName.values()[rand.nextInt(ProductName.values().length)].getName();

            double price = rand.nextDouble() * 9 + 1; // Цена от 1 до 10

            double weight = rand.nextDouble() * 3 + 2; // Вес от 2 до 5 кг

            Product product = new Product(name, price, weight);

            if (!cart.contains(product)) {
                cart.add(product);
            }
        }

        cart.removeIf(product -> product.getWeight() > 5 || product.getPrice() > 10000);

        Product favoriteProduct = new Product("Goku Figurine", 5, 3); // Пример любимого продукта (с весом > 2 и ценой < 10)
        if (!cart.contains(favoriteProduct)) {
            cart.add(favoriteProduct);
        }
        cart.remove(favoriteProduct);
        cart.add(0, favoriteProduct); // Ставим на первое место

        System.out.println("Products with price < 10 and weight > 2 kg:");
        boolean found = false;
        for (Product product : cart) {
            if (product.getPrice() < 10 && product.getWeight() > 2) {
                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found with price < 10 and weight > 2 kg.");
        }
    }
}

class Product {
    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", weight=" + weight + '}';
    }
}
