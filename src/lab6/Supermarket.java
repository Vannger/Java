package lab6;

public class Supermarket extends Store {
    // Поля класса Supermarket
    private double area;
    private String[] categories;

    // Конструктор по умолчанию
    public Supermarket() {
        super();
        this.area = 0.0;
        this.categories = new String[0];
    }

    // Конструктор с параметрами
    public Supermarket(int numberOfCashRegisters, Product[] products, int numberOfSellers, double area, String[] categories) {
        super(numberOfCashRegisters, products, numberOfSellers);
        this.area = area;
        this.categories = categories;
    }

    // Мутаторы (сеттеры) и аксессоры (геттеры)
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    // Переопределение метода для вычисления эффективности супермаркета
    @Override
    public double calculateOverallEfficiency() {
        double cashEfficiency = calculateCashRegisterEfficiency();
        return categories.length > 0 ? (area / categories.length) * cashEfficiency : 0;
    }

    // Переопределение метода для вывода данных в строке
    @Override
    public String toString() {
        return "Supermarket with " + getNumberOfCashRegisters() + " cash registers, " +
                getProducts().length + " products, " +
                getNumberOfSellers() + " sellers, " +
                "area: " + area + ", " +
                categories.length + " categories. Overall Efficiency: " + calculateOverallEfficiency();
    }
}