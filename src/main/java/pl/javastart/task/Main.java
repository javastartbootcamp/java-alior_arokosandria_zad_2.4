package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Thing thinqProduct1 = new Thing("Milka", "czekolada");
        Thing thinqProduct2 = new Thing("Fistaszki", "cukierki");
        Thing thinqProduct3 = new Thing("Chilli", "w proszku");
        Thing thinqProduct4 = new Thing("Resorak", "na baterie");
        Thing thingCategory1 = new Thing("słodycze", "coś słodkiego");
        Thing thingCategory2 = new Thing("przyprawy", "ostre");
        Category category1 = new Category(thingCategory1);
        Category category2 = new Category(thingCategory2);
        Product product1 = new Product(thinqProduct1, 100.00, category1);
        Product product2 = new Product(thinqProduct2, 120.00, category1);
        Product product3 = new Product(thinqProduct3, 140.00, category2);
        Product product4 = new Product(thinqProduct4, 140.00);
        SpecialOffer specialOffer = new SpecialOffer(product1, "01-10", 0.2,"oferta specjalna na walentynki");
        product1.show();
        product2.show();
        product3.show();
        product4.showWithoutCategory();
        System.out.println("Cena pierwszego produktu po obniżce " + specialOffer.priceWithBonus());
    }
}
