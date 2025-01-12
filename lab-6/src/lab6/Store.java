package lab6;

public class Store {
    // Поля класса Store
    private int numberOfCashRegisters;
    private Product[] products;
    private int numberOfSellers;

    // Конструктор по умолчанию
    public Store() {
        this.numberOfCashRegisters = 0;
        this.products = new Product[0];
        this.numberOfSellers = 0;
    }

    // Конструктор с параметрами
    public Store(int numberOfCashRegisters, Product[] products, int numberOfSellers) {
        this.numberOfCashRegisters = numberOfCashRegisters;
        this.products = products;
        this.numberOfSellers = numberOfSellers;
    }

    // Мутаторы (сеттеры) и аксессоры (геттеры)
    public int getNumberOfCashRegisters() {
        return numberOfCashRegisters;
    }

    public void setNumberOfCashRegisters(int numberOfCashRegisters) {
        this.numberOfCashRegisters = numberOfCashRegisters;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getNumberOfSellers() {
        return numberOfSellers;
    }

    public void setNumberOfSellers(int numberOfSellers) {
        this.numberOfSellers = numberOfSellers;
    }

    // Метод для расчета среднего веса продукта
    public double calculateAverageProductWeight() {
        double totalWeight = 0;
        for (Product product : products) {
            totalWeight += product.getWeight();
        }
        return products.length > 0 ? totalWeight / products.length : 0;
    }

    // Метод для расчета эффективности кассы
    public double calculateCashRegisterEfficiency() {
        return numberOfCashRegisters > 0 ? (double) numberOfSellers / numberOfCashRegisters : 0;
    }

    // Метод для вычисления общей эффективности магазина
    public double calculateOverallEfficiency() {
        double averageWeight = calculateAverageProductWeight();
        double cashEfficiency = calculateCashRegisterEfficiency();
        return cashEfficiency > 0 ? averageWeight / cashEfficiency : 0;
    }

    // Метод для вывода данных в строке
    public String toString() {
        return "Store with " + numberOfCashRegisters + " cash registers, " +
                products.length + " products, " +
                numberOfSellers + " sellers. Overall Efficiency: " + calculateOverallEfficiency();
    }

    // Вложенный класс Product
    public static class Product {
        private double weight;
        private double price;
        // Дополнительное поле, например, название продукта
        private String name;

        // Конструктор по умолчанию
        public Product() {
            this.weight = 0.0;
            this.price = 0.0;
            this.name = "";
        }

        // Конструктор с параметрами
        public Product(double weight, double price, String name) {
            this.weight = weight;
            this.price = price;
            this.name = name;
        }

        // Мутаторы (сеттеры) и аксессоры (геттеры)
        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}