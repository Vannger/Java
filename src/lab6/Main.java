package lab6;

public class Main {
    public static void main (String[] args){
        Store.Product[] products={
                new Store.Product(200,100, "Mayonnaise Makheev"),
                new Store.Product(100,100,"Eg"),
                new Store.Product(80,71,"Snickers"),
        };
        Store store=new Store(4,products,3);
        System.out.println(store);

        String[] categories={
                "Meat, Diary, Pastry, Eg"
        };
        Supermarket supermarket=new Supermarket(20,products,20,100,categories);
        System.out.println(supermarket);
    }
}
