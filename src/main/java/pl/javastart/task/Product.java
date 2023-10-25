package pl.javastart.task;

public class Product {
    Thing productDescribe;
    double price;
    Category category;

    public Product(Thing productDescribe, double price, Category category) {
        this.productDescribe = productDescribe;
        this.price = price;
        this.category = category;
    }

    public Product(Thing productDescribe, double price) {
        this.productDescribe = productDescribe;
        this.price = price;

    }

    public void show() {
        System.out.println("Nazwa produktu: " + productDescribe.name);
        System.out.println("Opis produktu: " + productDescribe.describe);
        System.out.println("Cena : " + price);
        System.out.println("Nazwa kategorii: " + category.categoryDescribe.name);
        System.out.println("Opis kategorii: " + category.categoryDescribe.describe);
    }

    public void showWithoutCategory() {
        System.out.println("Nazwa produktu: " + productDescribe.name);
        System.out.println("Opis produktu: " + productDescribe.describe);
        System.out.println("Cena : " + price);
    }

}

