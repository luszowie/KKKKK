public class ProductTester {
    public static void main(String[] args) {
       Product product1 = new Product(20,"Kawa");
       Product product2 = new Product(20, "Kawa");
       // Product product3 = new Product(15, "Herbata");
       // Product product4 = new Product(35, "Ciastka");
       //Product[] products = {

               // new Product (20,"Kawa");
              //  new Product(20, "Masło");
              //  new Product(15, "Herbata");
               // new Product(35, "Ciastka");
     //   };

        if (product1.equals(product2)) {
            System.out.println("Ten sam produkt");


        }
    }

       public boolean equals(Product product) {
        return true;
    }
}
